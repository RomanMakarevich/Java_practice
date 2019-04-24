package java_practic.lectures.lecture_4;

import java.util.Arrays;
import java.util.Random;

public class Program3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random ();
        int max  = 10;
        int min = 1;
        for (int i =0; i < array.length; i++){
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        System.out.println(Arrays.toString(array));
        int minEL = array[0];

        for (int i=0; i < array.length; i++){
            if (minEL > array[i]){
                minEL = array[i];
            }
        }
        System.out.println("Min array element: " + minEL);

        int maxEl = array[0];
        for (int i=0; i < array.length; i++){
            if (maxEl < array[i]){
                maxEl = array[i];
            }
        }
        System.out.println("Max array element: " + maxEl);


    }
}
