package java_practic.lectures.lecture_22.task_8;

import java_practic.lectures.lecture_22.task_2.Phone;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class Task_8 {
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

        List<Phone> applePhones = phones.stream()
                .filter(phone -> phone.getProducer().equals("Apple"))
                .collect(Collectors.toList());

        List<Phone> otherPhones = phones.stream()
                .filter(phone -> phone.getProducer() != ("Apple"))
                .collect(Collectors.toList());

        System.out.println(applePhones);
        System.out.println();
        System.out.println(otherPhones);
    }
}
