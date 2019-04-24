package java_practic.homework.homework_4.task_3;

import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int size = 0;
        Scanner sc = new Scanner(System.in);

        while (size < 4) {
            System.out.println("Введите размер массива:");
            size = sc.nextInt();
            if (size < 4) {
                System.out.println("Введено неправильное число, повторите ввод.");
            } else {
                System.out.println("Размер масива - " + size);
            }
        }
        int[] arrayA = new int[size];
        Random random = new Random();
        System.out.print("arrayA = ");
        int sizeArrayB = 0;


        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextInt(size + 1);
            if ((arrayA[i] % 2) == 0) {
                    sizeArrayB++;
            }
            System.out.print(arrayA[i] + ", ");
        }
        System.out.println();

        int[] arrayB = new int[sizeArrayB];
        System.out.print("arrayB = ");
        int numberArrayB = 0;

            for (int i = 0;i < arrayA.length; i++){
                if ((arrayA[i]%2) == 0){

                    arrayB[numberArrayB] = arrayA[i];
                    System.out.print(arrayB[numberArrayB] + ", ");
                    numberArrayB++;
                }


            }



    }
}
