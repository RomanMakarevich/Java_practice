package java_practic.lectures.lecture_15.task_1;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> names  = new ArrayList<>();
        names.add("Vasya");
        names.add("Petya");
        names.add("Olya");
String result = String.join("-", names);

        System.out.println(result);

    }
}
