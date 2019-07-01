package java_practic.lectures.lecture_20.task_1;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        Function<Integer, String> rubl = number1 -> {
            String result =  number + " BYN";
            return result;
        };
        System.out.println(rubl.apply(number));
    }
}
