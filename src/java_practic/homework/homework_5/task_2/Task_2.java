package java_practic.homework.homework_5.task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        String[] array = new String[5];
        System.out.println("Enter 5 words:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.printf("Word №%d:", i+1);
            array[i] = scanner.nextLine();
        }
        System.out.println(find(array));

    }


    static Boolean find (String[] array){
        String dog ="dog";
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(dog)){
                return true;
            }
        }
        return false;

    }

}
