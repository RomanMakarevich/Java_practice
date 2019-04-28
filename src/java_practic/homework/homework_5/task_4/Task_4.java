package java_practic.homework.homework_5.task_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //не стесняйся ставить новый абзац, так код гораздо лучше читается
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        
        System.out.println("Enter year, when you was born:");
        int year = scanner.nextInt();
        
        System.out.println("Enter your area:");
        String area = scanner.nextLine(); //я не понимаю, почему с переменной "name" scanner.nextLine сработала, а тут эту процедуру просто пропускает.
        myMetod(name, age, year, area);

    }

    static void myMetod (String name, int age, int year, String area ){
        System.out.printf("Hi, my name is %s. I’m %d years old and I was born in %d. I’m the true ruler of %s!!!", name, age, year, area);
    }
}
