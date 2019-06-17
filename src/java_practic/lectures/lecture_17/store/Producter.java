package java_practic.lectures.lecture_17.store;

public class Producter extends Thread {
    Store store;


    Producter(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
