package java_practic.homework.homework_4.task_6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfPlayers = 11;

        while (numberOfPlayers > 10) {
            System.out.println("Enter number of players:");
            numberOfPlayers = sc.nextInt();
            if (numberOfPlayers > 10){
                System.out.println("The number of players should be 1...10");
            }
        }
        int[] array = new int[54];

        System.out.print("array: ");
        for (int i = 0; i < array.length; i++){
            array[i] = i;
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        Random random = new Random();

        int min = 0;
        int max = array.length - 1;
        int buf;
        for (int i = 0; i < array.length; i++){
            buf = array[i];
            int a = random.nextInt((max-min)+1) + min;
            array[i] = array[a];
            array[a] = buf;
        }
        System.out.println("new array: " + Arrays.toString(array));

        for (int i = 0; i < (5*numberOfPlayers); i++){
            if ((i%5) == 0){
                System.out.println();
                System.out.println();
            }

            System.out.print(array[i] + ", ");
        }


    }
}
