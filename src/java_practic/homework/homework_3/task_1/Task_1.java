package java_practic.homework.homework_3.task_1;

import java.math.BigDecimal;

public class Task_1 {
    public static void main(String[] args) {

        int myArgument = Integer.parseInt (args[0]);
        BigDecimal myArgument2 = new BigDecimal(myArgument);
        
        /* а если будет не 256 ? не стоит в имени переменной такие штуки делать, имя должно быть говорящим и обобщенным, т.е.
        не number256, а multiplier например.
        */
        BigDecimal multiplier = new BigDecimal(256);

        /*
        да, хороший выход из положения, в данном примере 256 - это степень числа 2, можно было через << умножить
        */
        System.out.println(myArgument2.multiply(multiplier));


    }

}