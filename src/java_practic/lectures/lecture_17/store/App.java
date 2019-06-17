package java_practic.lectures.lecture_17.store;

public class App {
    public static void main(String[] args) {
        Store store = new Store();
        new Producter(store).start();
        new Consumer(store).start();
    }
}
