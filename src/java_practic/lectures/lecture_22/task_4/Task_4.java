package java_practic.lectures.lecture_22.task_4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task_4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Optional<Integer> multiply = numbers.stream()
                .limit(5)
                .reduce((x,y) -> x*y);

        System.out.println(multiply.get());
     }
}
