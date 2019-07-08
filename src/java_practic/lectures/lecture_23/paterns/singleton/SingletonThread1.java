package java_practic.lectures.lecture_23.paterns.singleton;

public class SingletonThread1 implements Runnable {
    @Override
    public void run() {
        try {
            Singleton singleton1 = Singleton.getInstance("Good!");
            Thread.sleep(1000);
            System.out.println(singleton1.value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
