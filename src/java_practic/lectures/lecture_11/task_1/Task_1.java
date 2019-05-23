package java_practic.lectures.lecture_11.task_1;

public class Task_1<T> {

    private T something;

    public Task_1 (T something){
        this.something = something;
    }

    public void info(){
        System.out.println(something.getClass().getName());
    }
}
