package java_practic.homework.homework_14.task_1;

import java.util.concurrent.Semaphore;

// не понимаю, почему не срабатывает wait();
//Задумка следующая: прежде чем заплыть в тоннель, корабль смотрит есть ли в бухте место. Если места нет, то поток должен ожидать.
//Когда корабль загрузился и выплывает из тоннеля, он будет поток.

// если программа ведет себя непонятно - пробуй через дебаг, можешь побольше выводов на экран сделать, чтобы понятнее было
public class Tunnel {
    private Port port;
    private int counter;

    public Tunnel(Port port) {
        this.port = port;
        counter = 0;
    }

    Semaphore semaphoreTunnel = new Semaphore(3, true);

    public void swimIn() {

        try {
            // 4 - в константу класса, а лучше через конструктор
            while (counter > 4) {
                wait();
            }

            semaphoreTunnel.acquire();

            counter++;

            System.out.println("The ship " + Thread.currentThread().getId() + " sailed into the Bay through the tunnel.");

            Thread.sleep(5000);

            semaphoreTunnel.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void swimOut() {
        try {
            semaphoreTunnel.acquire();
            System.out.println("The ship " + Thread.currentThread().getId() + " sailed out of Bay through the tunnel.");
            semaphoreTunnel.release();
            counter--;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}
