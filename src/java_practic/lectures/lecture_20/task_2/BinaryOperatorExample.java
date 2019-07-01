package java_practic.lectures.lecture_20.task_2;

import java.util.function.BinaryOperator;
//+
public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (x, y) -> x*y;

        int numberX = 10;
        int numberY = 5;

        System.out.println(binaryOperator.apply(numberX,numberY));
    }
}
