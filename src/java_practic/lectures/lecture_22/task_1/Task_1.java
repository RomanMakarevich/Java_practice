package java_practic.lectures.lecture_22.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("sfgs", "srgsrgs", "dfgsdgr");

        List<String> sortedList = strings.stream()
                .filter(x -> x.length() > 4)
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
