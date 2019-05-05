package java_practic.lectures.lecture_8.task_2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(5, "black", "Marusya", 12, "home" );
        cat1.printInfo();
        Dog dog1 = new Dog(54,36, "Sharick", 8, "home");
        dog1.printInfo();
        Horse horse1 = new Horse(172, true, "Matilda", 2, "Sport");
        horse1.printInfo();
    }
}
