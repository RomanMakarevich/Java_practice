package java_practic.lectures.lecture_22.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task_3 {
    public static void main(String[] args) {
        List<Integer> numbes = Arrays.asList(1,5,7,3,54,8,77,114);

        Optional<Integer> foundNumber = numbes.stream()
                .filter(x -> x > 22)
                .findFirst();
        System.out.println(foundNumber.get());
    }
}
