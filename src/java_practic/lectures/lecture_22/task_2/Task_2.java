package java_practic.lectures.lecture_22.task_2;

import javax.swing.text.SimpleAttributeSet;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("phone 10", "Apple", 1000));
        phones.add(new Phone("Redmi not 6", "Xiaomi", 100));
        phones.add(new Phone("S8", "Samsung", 500));
        phones.add(new Phone("S8", "Samsung", 500));
        phones.add(new Phone("S8", "Samsung", 500));
        phones.add(new Phone("3310", "Nokia", 20));
        phones.add(new Phone("Experia", "Sony", 600));

        List<String> produsers = Arrays.asList("Apple", "Samsung", "Xiaomi");

        Set<String> sortedPhones = phones.stream()
                .map(x -> x.getProducer())
                .filter(n -> produsers.contains(n))
                .collect(Collectors.toSet());
        System.out.println(sortedPhones);

    }
}
