package java_practic.lectures.lecture_23.paterns.factory;

public class Truck implements ITransport{
    @Override
    public void deliver() {
        System.out.println("Delivered on the ground");
    }
}
