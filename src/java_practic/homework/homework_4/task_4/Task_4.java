package java_practic.homework.homework_4.task_4;

import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        String[] array = {"Каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};
        String buf;
        int a =0;
        System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length - 1 - i; i++) {
                buf = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = buf;


            }
        System.out.println(Arrays.toString(array));

    }
}
