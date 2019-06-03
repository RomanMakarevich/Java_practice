package java_practic.homework.homework_11.task_1;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList<String>();
        words.add("table");
        words.add("car");
        words.add("table");
        words.add("lunch");

        System.out.println(words);

        HashSet <String> uniqueWords = new HashSet<String>(words);

        System.out.println(uniqueWords);
    }
}
