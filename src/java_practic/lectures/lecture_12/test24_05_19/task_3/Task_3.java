package java_practic.lectures.lecture_12.test24_05_19.task_3;

public class Task_3<T> {
    private T something;

    public Task_3 (T something){
        this.something = something;
    }

    public void info(){
        System.out.println(something.getClass().getName());
    }
}
