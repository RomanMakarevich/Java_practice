package java_practic.lectures.lecture_17.lecture_17;


import java_practic.lectures.lecture_17.MyThread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started...");
       MyThread t = new MyThread("MyThread");
       t.start();
       try {
           t.join();
       }catch (InterruptedException e){
           System.out.println("Thread was interrupted");
       }

        System.out.println("Main thread finished");

    }
}
