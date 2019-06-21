package java_practic.homework.homework_13.supermarket;

import java.util.HashMap;

public class Consumer implements Runnable{
    SuperMarket superMarket;


    public Consumer(SuperMarket superMarket) {
        this.superMarket = superMarket;

    }

    @Override
    public void run() {
        superMarket.choose();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
