package java_practic.lectures.lecture_16.task_2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text {
    public static void main(String[] args) {
        String text = "Hello";

        try (FileOutputStream fos = new FileOutputStream("D:\\Java_Practice\\src\\java_practic\\lectures\\lecture_16\\task_2\\Text")){
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            for (int i = 0; i <1000_000 ; i++) {
                bos.write(text.getBytes());
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
