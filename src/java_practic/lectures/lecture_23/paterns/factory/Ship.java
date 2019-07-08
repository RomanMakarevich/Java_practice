package java_practic.lectures.lecture_23.paterns.factory;

public class Ship implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Delivered on the see!");
    }
}
