package java_practic.homework.homework_6.task_2;

import java_practic.lectures.lecture_8.task_2.AnimalsInfoPrinter;
import java_practic.lectures.lecture_8.task_2.Cat;
import java_practic.lectures.lecture_8.task_2.Dog;
import java_practic.lectures.lecture_8.task_2.Horse;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(5, "black", "Marusya", 12, "home" );

        Dog dog1 = new Dog(54,36, "Sharick", 8, "home");

        Horse horse1 = new Horse(172, true, "Matilda", 2, "Sport");

        AnimalsInfoPrinter animalsInfoPrinter = new AnimalsInfoPrinter();

        animalsInfoPrinter.info(cat1);
        animalsInfoPrinter.info(dog1);
        animalsInfoPrinter.info(horse1);
    }
}
