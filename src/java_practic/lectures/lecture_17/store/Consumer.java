package java_practic.lectures.lecture_17.store;

public class Consumer extends Thread{
    Store store;


    Consumer (Store store){
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }

    public static class MyThread2 implements Runnable {
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
}
