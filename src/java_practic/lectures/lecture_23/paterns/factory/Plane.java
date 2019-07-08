package java_practic.lectures.lecture_23.paterns.factory;

public class Plane implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Delivered by air");
    }
}
