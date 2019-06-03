package java_practic.homework.homework_11.task_4;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Task_4 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(1);
        numbers.add(2);
        numbers.add(9);

        System.out.println(numbers);

        NavigableSet <Integer> numbers1 = numbers.descendingSet();
        System.out.println(numbers1);
    }
}
