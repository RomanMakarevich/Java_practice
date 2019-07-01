package java_practic.lectures.lecture_19.task_2;

public class Main {
    public static void main(String[] args) {


        int x = 100;
        Calculate calculate = (n) -> Math.sqrt(x);
        System.out.println(calculate.calculate(x));
    }
}
