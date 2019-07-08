package java_practic.lectures.lecture_22.task_7;

import java_practic.lectures.lecture_22.task_2.Phone;

import java.util.*;
import java.util.stream.Collectors;

public class Task_7 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("phone 10", "Apple", 1000));
        phones.add(new Phone("phone 5", "Apple", 200));
        phones.add(new Phone("Redmi not 6", "Xiaomi", 100));
        phones.add(new Phone("S8", "Samsung", 500));
        phones.add(new Phone("S7", "Samsung", 500));
        phones.add(new Phone("S6", "Samsung", 500));
        phones.add(new Phone("3310", "Nokia", 20));
        phones.add(new Phone("Experia", "Sony", 600));

        Map <String, List<Phone>> counter = phones.stream()
                .collect(Collectors.groupingBy(Phone::getProducer));

        for (Map.Entry<String, List<Phone>> x:counter.entrySet()){
            System.out.println(x.getKey() + " - " + x.getValue());
        }
    }
}
