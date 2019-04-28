package java_practic.lectures.lecture_6.test;

import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        int  [][] array = new int[5][];
        Random rand = new Random();
        int min = 1;
        int max = 5;
        for (int i = 0; i < array.length; i++){
            array[i] = new int [rand.nextInt((max - min) + 1) + min];
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = rand.nextInt((max - min) + 1) + min;
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
