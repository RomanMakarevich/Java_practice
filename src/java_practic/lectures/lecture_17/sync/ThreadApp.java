package java_practic.lectures.lecture_17.sync;

public class ThreadApp {
    public static void main(String[] args) {
        CommonResource res = new CommonResource();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThread(res));
            t.setName("Thread " + i);
            t.start();

        }
    }
}
