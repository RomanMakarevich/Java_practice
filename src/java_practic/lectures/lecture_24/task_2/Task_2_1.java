package java_practic.lectures.lecture_24.task_2;

// не забывай форматировать код: code -> reformat code / alt+ctrl+L

// Если arraySecond пустой или состоит из одного элемента, то исключение, решение выглядит неплохо
public class Task_2_1 {
    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 4};
        int[] arraySecond = {2, 4, 7};

        int[] newarray = new int[arrayFirst.length + arraySecond.length];

        // назови эти переменные так, чтобы было понятно за что они отвечают
        int j = 0;
        int z = 0;
        int i = 0;
        while (i<  newarray.length) {

                if (j < arrayFirst.length && arrayFirst[j] < arraySecond[z]) {
                    newarray[i] = arrayFirst[j];
                    j++;
                    i++;
                } else {
                    newarray[i] = arraySecond[z];
                    z++;
                    i++;
                }
        }
        
        // Arrays.toString()
        for (int index = 0; index < newarray.length; index++) {
            System.out.print(newarray[index] + ", ");
        }
    }
}
