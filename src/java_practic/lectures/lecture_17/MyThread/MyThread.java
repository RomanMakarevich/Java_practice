package java_practic.lectures.lecture_17.MyThread;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("Thread %s started... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted...");
        }

        System.out.printf("Thread %s finished... \n", Thread.currentThread().getName());
    }
}
