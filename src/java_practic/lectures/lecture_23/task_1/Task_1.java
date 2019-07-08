package java_practic.lectures.lecture_23.task_1;

public class Task_1 {
    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 4, 6, 9, 11};
        int[] arraySecond = {2, 4, 7, 8, 12, 15, 20};

        int[] newArray = new int[arrayFirst.length + arraySecond.length];

        for (int i = 0; i < arraySecond.length; i++) {
            if (i < arrayFirst.length){
            newArray[i] = arrayFirst[i];}
            newArray[arrayFirst.length + i] = arraySecond[i];
        }
        boolean isSorted = false;
        int buf;
        while (!isSorted){
            for (int i = 0; i < newArray.length - 1; i++){
                if (newArray[i] > newArray[i+1]){
                   buf = newArray[i+1];
                   newArray[i+1] = newArray[i];
                   newArray[i] = buf;
                   isSorted = false;
                }
                isSorted = true;
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");
        }
    }
}
