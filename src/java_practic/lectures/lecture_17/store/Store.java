package java_practic.lectures.lecture_17.store;

public class Store {
   private int product = 0;

   public synchronized void get(){
       while (product < 1){
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

       product --;
       System.out.println("Consumer has bought 1 product!");
       System.out.println("Products int store: " + product);
       notify();
   }

   public synchronized void put(){
       while (product >= 3){
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

       product++;
       System.out.println("Producer has produced 1 product!");
       System.out.println("Products int store: " + product);
       notify();
   }



    /*int counter = 0;
    final int n = 5;

    synchronized int put(){
        if (counter <= n){
            counter++;
            System.out.println("Store has " + counter + " products");
            return 1;
        }
        return 0;
    }

    synchronized  int get(){
        if (counter > 0){
            counter--;
            System.out.println("Store has " + counter + " products");
            return  1;
        }
        return 0;
    }*/
}
