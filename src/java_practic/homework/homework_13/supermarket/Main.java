package java_practic.homework.homework_13.supermarket;

public class Main {
    public static void main(String[] args) {

        SuperMarket superMarket = new SuperMarket();

        Consumer consumer = new Consumer(superMarket);

        for (int i = 0; i < 30; i++) {
            Thread thread = new Thread(consumer);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Till till = new Till(superMarket);
        for (int i = 0; i < 3; i++) {
            Thread cashier = new Thread(till);
            cashier.start();
            try {
                cashier.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Left products in the super market: apple = %d, milk = %d, bread = %d", superMarket.getApple(), superMarket.getMilk(), superMarket.getBread());
    }
}
