package java_practic.homework.homework_5.task_1;

import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        question();
    }



/*
1. метод должен выполнять только 1 конкретное действие. Нельзя все внутрь. Твой метод должен принять вопрос
проверить его на знак вопроса и вернуть true/false остальное надо вынести в другой или оставить в методе main
*/
    static  void question() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your question:");
        String question = new String(scanner.nextLine());
        char [] array = question.toCharArray();

        boolean marker = false;
        // знак вопроса должен стоять в конце, у строки есть метод charAt() используй его
        for (int i = 0; i < array.length; i++){
            if (array[i] == '?'){
                marker = true;
            }
        }

        String[] answers = {"com true", "not come true"};
        if (marker == true){
            System.out.printf("your question: %s\n",question);
            System.out.printf("ansmer: %s",answers[random.nextInt((1-0)+1)]);
        }
        else {
            System.out.println("The question is not clear, ask again.");
            // рекурсия здесь плоха. если часто вводить неверный вопрос, то программа выдаст исключение (ошибку)
            question();
        }
    }
}
