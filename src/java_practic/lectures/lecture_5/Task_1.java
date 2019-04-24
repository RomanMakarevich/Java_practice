package java_practic.lectures.lecture_5;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[101];


        for (int i = 0; i<array.length; i++){
            array [i] = i;

        }
        int sumEven = 0;
        int sumUneven = 0;

        for (int i = 0; i<array.length; i++){
            if ((array[i]%2) == 0){
                 sumEven += array[i];
            }
            else {
                sumUneven += array[i];
            }

        }
        System.out.println("sumEven = " + sumEven);
        System.out.println("sumUneven = " + sumUneven);
        System.out.println("sumAll = " + (sumEven + sumUneven));

    }
}
