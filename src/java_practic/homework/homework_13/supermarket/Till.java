package java_practic.homework.homework_13.supermarket;

public class Till implements Runnable {

    private SuperMarket superMarket;

    public Till(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    @Override
    public void run() {

        superMarket.punching();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
