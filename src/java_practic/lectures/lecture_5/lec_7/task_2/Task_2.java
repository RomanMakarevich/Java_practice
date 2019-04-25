package java_practic.lectures.lecture_5.lec_7.task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        name = in.nextLine();
        welcome(name);
    }
    static void welcome (String name){
        System.out.printf("Hello, %s", name);
    }
}
