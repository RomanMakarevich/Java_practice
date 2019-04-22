package java_ractic.lectures.lecture_5;
import java.util.Scanner;

public class Task_1_1 {
    public static void main(String[] args) {
                String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        name = in.nextLine();
myMetod(name);
    }

    static void myMetod(String name) {
        String template = "Hello, %s";
        System.out.printf(template, name);

    }


}
