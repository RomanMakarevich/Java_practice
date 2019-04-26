package java_practic.lectures.lecture_6.test;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] array = new int[]{5,6,12,65,32,74};
        int buf;
        for (int i = 0; i < array.length-1; i++){
            buf = array[i];
            array[i] = array[i+1];
            array[i+1] = buf;
        }
        System.out.println(Arrays.toString(array));
    }
}
