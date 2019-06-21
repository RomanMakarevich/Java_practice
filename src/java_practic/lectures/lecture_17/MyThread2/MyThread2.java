package java_practic.lectures.lecture_17.MyThread2;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class MyThread2 implements Runnable {
    private boolean isAlive;

    void disable() {
        isAlive = false;
    }

    public MyThread2() {
        isAlive = true;
    }


    @Override
    public void run() {

        System.out.printf("Thread %s started... \n", currentThread().getName());
        int counter = 1;

        while (isAlive) {
            System.out.println("Loop " + counter++);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted...");
            }
        }

        System.out.printf("Thread %s finished... \n", currentThread().getName());
    }
}
