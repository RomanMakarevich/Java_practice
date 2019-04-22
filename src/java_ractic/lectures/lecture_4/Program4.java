package java_ractic.lectures.lecture_4;

import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
        int [] array = {11,3,14,16,7};
        boolean isSorted = false;
        int buf;
        System.out.println (Arrays.toString(array));
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i+1]) {
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
