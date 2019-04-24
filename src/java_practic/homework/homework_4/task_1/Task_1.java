package java_practic.homework.homework_4.task_1;

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();
        int max = 10;
        int min = 1;

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(array[i]+ ", ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            if ((array[i]%2) != 0){
                array[i] = 0;
            }
            System.out.print(array[i] + ", ");
        }


    }
}
