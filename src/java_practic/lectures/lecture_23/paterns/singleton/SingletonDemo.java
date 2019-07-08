package java_practic.lectures.lecture_23.paterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        System.out.println("If you see the same value, singleton was resed. If you see different value singleton was faild.");

        Thread t1 = new Thread(new SingletonThread1());
        Thread t2 = new Thread(new SingletonThread2());
        t1.start();
        t2.start();


        //        Singleton singleton = Singleton.getInstance("Good!");
//        Singleton singleton1 = Singleton.getInstance("Bad!");
//
//        System.out.println(singleton.value);
//        System.out.println(singleton1.value);

    }
}
