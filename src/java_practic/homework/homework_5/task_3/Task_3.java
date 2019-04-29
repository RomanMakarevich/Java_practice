package java_practic.homework.homework_5.task_3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Number %d: ", i+1);
            array[i] = scanner.nextInt();
        }
        int number = 0;
        // как-то не очень отформатировано, используй меню code(вверху)->reformat code
        recursion(number, array);
    }

    // int замени на void, зачем нам что-то возвращать в данном задании?
    static void recursion(int number, int[] array) {

        if (number < array.length) {
            // 1, 25, 465, 32, 100, 
            // это твой вывод, где-то есть лишняя запятая. Надо убрать
            System.out.print(array[number]);

            if (number < array.length-1){
                System.out.print(", ");
            }else {
                System.out.print(".");
            }
            recursion(number + 1, array);
        }

    }
}
