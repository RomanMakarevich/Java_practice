package java_practic.lectures.lecture_23.paterns.singleton;

public class SingletonThread2 implements Runnable {
    @Override
    public void run() {
        try {
            Singleton singleton2 = Singleton.getInstance("Bad!");
            Thread.sleep(1000);
            System.out.println(singleton2.value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
