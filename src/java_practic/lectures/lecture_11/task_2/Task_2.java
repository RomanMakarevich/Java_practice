package java_practic.lectures.lecture_11.task_2;

public class Task_2<I> {



    public static <T extends Number> double sum(T[] array){
        double sum = 0;

        for (int i = 0; i < array.length;i++){
            sum += array[i].doubleValue();
        }
        return sum;
    }
    public  static <T extends Number> double medium (T[] array){
        double sum = 0;
        for (int i = 0; i < array.length;i++){
            sum += array[i].doubleValue();
        }
        double medium = sum/array.length;
        return medium;
    }

}
