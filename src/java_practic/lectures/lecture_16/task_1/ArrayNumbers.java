package java_practic.lectures.lecture_16.task_1;

import java.io.*;

public class ArrayNumbers {
    public static void main(String[] args) {
        int[] array = {1,5,4,6,12};

        try (FileOutputStream fos = new FileOutputStream("D:\\Java_Practice\\src\\java_practic\\lectures\\lecture_16\\task_1\\Array");){

            for (int i = 0; i <array.length ; i++) {
                fos.write(Integer.toString(array[i]).getBytes());
            }
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
