package java_practic.lectures.lecture_5.lec_7.task_5;

import java.math.BigInteger;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = scanner.nextInt();
        System.out.printf("%d! = %d", number, factorial(number));

    }


    static BigInteger factorial(int number) {
        int[] array = new int[number];
        BigInteger factorial = new BigInteger("1");

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 1; i < array.length; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(array[i]));
        }
        return factorial;
    }


    }
