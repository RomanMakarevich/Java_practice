package java_practic.homework.homework_14.task_1;

import java.util.concurrent.Semaphore;

public class Port {
    private Semaphore semaphorePort;

    public Port() {
        semaphorePort = new Semaphore(5, true);
    }

    public void load(int cutting) {
        try {
            semaphorePort.acquire();
            System.out.println("The Ship " + Thread.currentThread().getId() + " is loading");
            for (int i = 0; i < cutting; i++) {
                Thread.sleep(1000);
            }

            System.out.println("The Ship " + Thread.currentThread().getId() + " is loaded " + cutting + " tone");

            semaphorePort.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
