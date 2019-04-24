package java_practic.homework.homework_3.task_3;

public class Task_3 {
    public static void main(String[] args) {
        /* 
        да, так можно, но лучше у строки question вызвать метод replace() и не забыть что строки immutable, а значит полученный
        результат надо присвоить переменной question
        */
        String question = "Whara is my dog+";
        char[] array = question.toCharArray();
        char symbolA = 'a';
        char symbolE = 'e';
        char symbolPlus = '+';
        char symbolQuestion = '?';
        for (char i = 0; i < array.length; i++) {

            if (array[i] == symbolA) {
                array[i] = symbolE;
            }
            if (array[i] == symbolPlus){
                array[i] = symbolQuestion;
            }
        }
                System.out.println(array);
    }
}
