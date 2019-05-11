//перед повторной отправкой на проверку удалять твои комментарии или оставлять,
//чтобы удобно было посмотреть в чём был косяк в прошлы раз?

package java_practic.homework.homework_6.task_1;

import java.util.Scanner;

public class Mersedes {
    public static void main(String[] args) {
        Engine mersedesEengine = new Engine();
        Transmission mersedesTransmission = new Transmission();
        Car mersedes = new Car("Mersedes", mersedesEengine, mersedesTransmission);

        //  ты сначала вызываешь метод gasPedalOn(), а затем engineOn(). Думаю должно быть наоборот
        // далее, скорее всего метод для увеличения скорости долже называться speedUp(), а не gasPedalOn()
        // в целом неплохо, попробуй сделать интерактивное дествие с пользователем,
        // т.е. через Scanner получать команды, для увеличения скорости, остановки и т.д.

        Scanner scanner = new Scanner(System.in);
        String command = new String();
        boolean forComparison = true;

        System.out.println("Enter command.\nYou can use: engine start, engine stop, gas, transmission up, transmission down,\nstop, show speed, show number of transmission, end.");

        while ((command.equals("end")) != forComparison){
            System.out.println("command: ");
            command = scanner.nextLine();

            if (command.equals("engine start")){
                mersedesEengine.engineOn();
                continue;
            }
            if (command.equals("engine stop")){
                mersedesEengine.engineOff();
                continue;
            }
            if (command.equals("gas")){
                mersedes.gasPedalOn();
                continue;
            }
            if (command.equals("transmission up")){
                mersedesTransmission.transmissionUp();
                continue;
            }
            if (command.equals("transmission down")){
                mersedesTransmission.transmissionDown();
                continue;
            }
            if (command.equals("stop")){
                mersedes.stop();
                continue;
            }
            if (command.equals("show speed")){
                System.out.println("Speed = " + mersedes.getSpeed());
                continue;
            }
            if (command.equals("show number of transmission")){
                System.out.println("number of transmission - " + mersedesTransmission.getNumberOfTransmission());
                continue;
            }
            if (command.equals("end")){
                continue;
            }

            System.out.println("Unknown command");
        }
    }
}
