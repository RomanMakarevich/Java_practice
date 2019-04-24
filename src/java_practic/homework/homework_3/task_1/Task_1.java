package java_practic.homework.homework_3.task_1;

import java.math.BigDecimal;

public class Task_1 {
    public static void main(String[] args) {

        int myArgument = Integer.parseInt (args[0]);
        BigDecimal myArgument2 = new BigDecimal(myArgument);
        BigDecimal number256 = new BigDecimal(256);

        System.out.println(myArgument2.multiply(number256));


    }

}