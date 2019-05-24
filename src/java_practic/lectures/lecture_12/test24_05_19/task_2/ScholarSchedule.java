package java_practic.lectures.lecture_12.test24_05_19.task_2;

import java.util.Scanner;

public class ScholarSchedule {


public static int id(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter day");
    System.out.printf("0.Monday,\n1.saturday");
    int id;
    id = scanner.nextInt();
    return id;
}
}
