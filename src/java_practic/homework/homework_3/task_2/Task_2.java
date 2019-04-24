package java_practic.homework.homework_3.task_2;

import java.math.BigDecimal;
import java.math.MathContext;

public class Task_2 {
    public static void main(String[] args) {
        float numberA = 1.2F;
        float numberB = 1.4F;
        
        // у тебя дальше идет верное решение через BigDecimal, соот-но такое надо убирать, код должен быть чистым
        // если хотел оставить себе как конспект, то коммент делай что складывать числа с точкой можно только через BigDecimal
        float sumFloat = numberA + numberB;
        System.out.println("sumFloat = " + sumFloat);

        MathContext mc = new MathContext(2);
        BigDecimal numberDoubleA = new BigDecimal(1.2,mc);
        BigDecimal numberDoubleB = new BigDecimal(1.4,mc);

        System.out.println("resultSumDouble = " + numberDoubleA.add(numberDoubleB,mc));



    }
}
