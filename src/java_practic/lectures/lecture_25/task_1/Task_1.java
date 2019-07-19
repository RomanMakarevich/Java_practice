package java_practic.lectures.lecture_25.task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter old version: ");
        String oldVersion = scanner.nextLine();
        System.out.println("Enter new version: ");
        String newVersion = scanner.nextLine();

        if (oldVersion.hashCode() < newVersion.hashCode()){
            System.out.println("Project using old version!");
        }else if (oldVersion.hashCode() > newVersion.hashCode()){
            System.out.println("Project using new version!");
        }else {
            System.out.println("Unknown vaiue");
        }
    }
}
