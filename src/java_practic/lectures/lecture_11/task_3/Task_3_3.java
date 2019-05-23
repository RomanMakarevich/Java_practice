package java_practic.lectures.lecture_11.task_3;

public class Task_3_3<T> implements Task_3<T> {


    @Override
    public void showClassName(Object something) {
        System.out.println(something.getClass().getName());
    }
}
