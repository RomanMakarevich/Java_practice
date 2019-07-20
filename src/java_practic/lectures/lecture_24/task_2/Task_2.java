package java_practic.lectures.lecture_24.task_2;

/*
- эта задача решается за 1 проход по массивам, Игнат Мухич ее неплохо решил, попроси его помочь

- куски логики, например циклы выноси в отдельные методы
*/
public class Task_2 {
    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 4, 6, 9, 11};
        int[] arraySecond = {2, 4, 7, 8, 12, 15, 20};

        // int[] mergedArray
        int[] newArray = new int[arrayFirst.length + arraySecond.length];

        for (int i = 0; i < arraySecond.length; i++) {
            if (i < arrayFirst.length){
                newArray[i] = arrayFirst[i];}
            newArray[arrayFirst.length + i] = arraySecond[i];
        }
        boolean isSorted = false;
        int buf;
        while (!isSorted){
            // выглядит странно, когда в начале каждой итерации переменной присваивают значение
            isSorted = true;
            for (int i = 0; i < newArray.length - 1; i++){

                if (newArray[i] > newArray[i+1]){
                    buf = newArray[i+1];
                    newArray[i+1] = newArray[i];
                    newArray[i] = buf;
                    isSorted = false;
                }
            }
        }

        // 1, 2, 3, 4, 4, 6, 7, 8, 9, 11, 12, 15, 20, - вот что распечатал твой метод, не годится. Arrays.toString()
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");
        }
    }
}
