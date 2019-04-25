package java_practic.lectures.lecture_5.lec_5.task_5;

import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        for (int i = 1; i < array.length; i++){
            array[i] = array[i-1] * 2;
        }
        System.out.println(Arrays.toString(array));
    }

}
