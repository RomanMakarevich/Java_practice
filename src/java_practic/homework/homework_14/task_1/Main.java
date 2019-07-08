package java_practic.homework.homework_14.task_1;

import java.util.Random;
/*
1. зачем кораблю поля порт и тоннель? этим должен управлять кто-то из вне, но точно не корабль
2. Сделай так, чтобы было видно, что корабль проплыл тоннель, а не просто зашел в него (очень похоже на consumer-producer задачу)
*/
public class Main {
    public static void main(String[] args) {

        Port port = new Port();
        Tunnel tunnel = new Tunnel(port);
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int cattying = random.nextInt(2);
            switch (cattying) {
                case 0:
                    new Thread(new Ship(20, tunnel, port)).start();

                case 1:
                    new Thread(new Ship(50, tunnel, port)).start();

                case 2:
                    new Thread(new Ship(100, tunnel, port)).start();
            }
        }
    }
}
