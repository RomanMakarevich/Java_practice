package java_ractic.lectures.lecture_4;

import java.util.Random;

public class Program6 {
    public static void main(String[] args) {
        int [][] arr = new int [5][];
        Random rand = new Random();
        int min = 1;
        int max = 5;
        for (int i = 0; i < arr.length; i++){
            arr[i] = new int [rand.nextInt((max - min)+1)+min];
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr [i][j] = rand.nextInt((max - min)+1)+min;
            }
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }
}
