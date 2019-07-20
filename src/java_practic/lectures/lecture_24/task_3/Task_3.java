package java_practic.lectures.lecture_24.task_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task_3 {

    public static void main(String[] args) {

        List<StringBuilder> strings = new ArrayList<>();
        strings.add(new StringBuilder("5home"));
        strings.add(new StringBuilder("cat"));
        strings.add(new StringBuilder("78word"));
        strings.add(new StringBuilder("string"));
        strings.add(new StringBuilder("4number"));

        String numbers = "[0-9].*";

        for (StringBuilder string : strings) {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                if (string.toString().matches(numbers)) {
                    string.deleteCharAt(0);
                    isSorted = false;
                }
            }
        }

        List<StringBuilder> sortedList = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        /*
        List<String> collect = strings.stream()
                .map(word -> word.replaceAll("\\w", "")) // <- используем regex для замены всех цифр на пустой символ
                .sorted()
                .collect(Collectors.toList());
        */
        System.out.println(sortedList);
    }
}
