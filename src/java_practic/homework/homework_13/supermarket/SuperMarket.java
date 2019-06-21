package java_practic.homework.homework_13.supermarket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class SuperMarket {
    private int apple;
    private int milk;
    private int bread;

    private ArrayList<HashMap> turn;

    public SuperMarket() {
        this.apple = 100;
        this.milk = 100;
        this.bread = 100;
        this.turn = new ArrayList<>();
    }

    public int getApple() {
        return apple;
    }

    public int getMilk() {
        return milk;
    }

    public int getBread() {
        return bread;
    }

    public synchronized void punching() {

        while (!turn.isEmpty()) {
            HashMap<String, Integer> buf = new HashMap();
            buf.putAll(turn.get(0));
            System.out.printf("Till %d sall off %s\n", Thread.currentThread().getId(), buf.toString());
            turn.remove(0);

            if (buf.get("apple") == null){
                continue;
            }
            apple -= (buf.get("apple"));

            if (buf.get("milk") == null){
                continue;
            }
            milk -= (buf.get("milk"));

            if (buf.get("bread") == null){
                continue;
            }
            bread -= (buf.get("bread"));
        }
    }

    public void choose() {

        Random random = new Random();
        HashMap<String, Integer> cart = new HashMap<>();
        int counter = 0;
        String nameOfProdukt = null;

        while (counter < 7) {

            int numberOfProdukt = random.nextInt((2 - 0) + 1);
            switch (numberOfProdukt) {
                case 0:
                    nameOfProdukt = "apple";
                    break;
                case 1:
                    nameOfProdukt = "milk";
                    break;
                case 2:
                    nameOfProdukt = "bread";
                    break;
            }

            if (cart.containsKey(nameOfProdukt)) {
                Integer buf = (Integer) cart.get(nameOfProdukt);
                cart.put(nameOfProdukt, ++buf);
            } else {
                cart.put(nameOfProdukt, 1);
            }
            counter++;
        }
        System.out.printf("Costumer%d took: %s\n", Thread.currentThread().getId(), cart.toString());
        turn.add(cart);
    }
}
