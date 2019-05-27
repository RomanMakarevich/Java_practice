package java_practic.homework.homework_10.task_1;

public class SumArray<T> {

    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }
        return sum;
    }

}
