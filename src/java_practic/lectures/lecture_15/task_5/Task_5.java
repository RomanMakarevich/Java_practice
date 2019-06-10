package java_practic.lectures.lecture_15.task_5;

import java.util.regex.Pattern;

public class Task_5 {
    public static void main(String[] args) {
        String words = "Gteen, red , blue, yellow";

        String[] arrayWords = words.split(",");

        for (int i = 0; i <arrayWords.length ; i++) {
            arrayWords[i] = arrayWords[i].trim();
            System.out.println(arrayWords[i]);
        }
    }
}
