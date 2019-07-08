package java_practic.lectures.lecture_22.task_5;

import java_practic.lectures.lecture_22.task_2.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task_5 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("phone 10", "Apple", 1000));
        phones.add(new Phone("Redmi not 6", "Xiaomi", 100));
        phones.add(new Phone("S8", "Samsung", 500));
        phones.add(new Phone("S8", "Samsung", 500));
        phones.add(new Phone("S8", "Samsung", 500));
        phones.add(new Phone("3310", "Nokia", 20));
        phones.add(new Phone("Experia", "Sony", 600));

         List<Phone> sortedPhones = phones.stream()
                .distinct()
                 .collect(Collectors.toList());


        System.out.println(sortedPhones);

    }
}
