package java_practic.lectures.lecture_10.task_4;

public class Door implements Openable {
    @Override
    public void open() {
        System.out.println("Door open");
    }

    @Override
    public void close() {
        System.out.println("Door close");
    }
}
