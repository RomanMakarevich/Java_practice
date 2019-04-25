package java_practic.lectures.lecture_5.lec_5.task_4;

import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        int[] fibonachi = new int[10];
fibonachi[0] = 1;
fibonachi[1] = 1;
        for (int i = 2; i < fibonachi.length; i++){
            fibonachi[i] = fibonachi[i-1] + fibonachi[i-2];
        }
        System.out.println(Arrays.toString(fibonachi));


    }
}
