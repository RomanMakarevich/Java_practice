package java_practic.lectures.lecture_5.lec_7.task_3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int numberOne = 0;
        int numberTwo = 0;
        double numberThree = 0;
        double numberFour = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers for sum.");
        System.out.println("Number one:");

        if (scanner.hasNextInt()){
            numberOne = scanner.nextInt();
        }
        else if (scanner.hasNextDouble())
        {
            numberThree = scanner.nextDouble();
        }

        System.out.println("Enter number two:");

        if (scanner.hasNextInt()){
            numberTwo = scanner.nextInt();
        }
        else if (scanner.hasNextDouble())
        {
            numberFour = scanner.nextDouble();
        }


        if ((numberThree != 0)|(numberFour != 0)) {

            double sum = sum(numberOne, numberTwo, numberThree, numberFour);
            System.out.printf("Sum = %.2f", sum);
        }
        else {
            int sum = sum(numberOne, numberTwo);
            System.out.printf("Sum = %f", sum);
        }

    }
    static int sum (int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    static double sum (double numberOne, double numberTwo, double numberThree, double numberFour){
        return numberOne + numberTwo + numberThree + numberFour;
    }
}
