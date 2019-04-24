package java_practic.homework.homework_4.task_2;

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];
        Random random = new Random();
        int min = 0;
        int max = 5;

        System.out.print("arrayA: ");

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(arrayA[i] + ", ");
        }
        System.out.println();
        System.out.print("arrayB: ");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(arrayB[i] + ", ");

        }
        System.out.println();
        double mediumA;
        double sumA = 0;
        double mediumB;
        double sumB = 0;

        for (int i = 0; i < arrayA.length; i++){
            sumA += arrayA[i];
        }
        mediumA = sumA / arrayA.length;
        System.out.println("mediumA = " + mediumA);

        for (int i = 0; i < arrayB.length; i++){
            sumB += arrayB[i];
        }
        mediumB = sumB / arrayB.length;
        System.out.println("mediumB = " + mediumB);
        if (mediumA > mediumB){
            System.out.println("mediumA > mediumB");
        }

        else if (mediumA == mediumB){
            System.out.println("mediumA == mediumB");
        }
        else{
            System.out.println("mediumA < mediumB");
        }
    }
}