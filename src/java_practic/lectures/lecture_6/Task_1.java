package java_practic.lectures.lecture_6;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1:
                System.out.println("1");
                break;
            case 2:
                 System.out.println("2");
                 break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
                default:
                    System.out.println("Number");
        }

    }
}
