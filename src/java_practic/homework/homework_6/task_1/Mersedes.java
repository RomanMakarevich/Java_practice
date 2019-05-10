package java_practic.homework.homework_6.task_1;

public class Mersedes {
    public static void main(String[] args) {
        Engine mersedesEengine = new Engine();
        Transmission mersedesTransmission = new Transmission();
        Car mersedes = new Car("Mersedes", mersedesEengine, mersedesTransmission);

        //  ты сначала вызываешь метод gasPedalOn(), а затем engineOn(). Думаю должно быть наоборот
        // далее, скорее всего метод для увеличения скорости долже называться speedUp(), а не gasPedalOn()
        // в целом неплохо, попробуй сделать интерактивное дествие с пользователем,
        // т.е. через Scanner получать команды, для увеличения скорости, остановки и т.д.
        mersedes.gasPedalOn();
        mersedesEengine.engineOn();

        mersedes.gasPedalOn();
        mersedesTransmission.transmissionUp();

        mersedes.gasPedalOn();
        mersedesTransmission.transmissionUp();

        mersedes.gasPedalOn();
        mersedesTransmission.transmissionUp();

        mersedes.gasPedalOn();
        mersedesTransmission.transmissionUp();

        mersedes.gasPedalOn();
        mersedesTransmission.transmissionUp();

        mersedes.gasPedalOn();
        mersedesTransmission.transmissionUp();

        mersedes.gasPedalOn();
        mersedesTransmission.transmissionUp();

        mersedes.gasPedalOn();
        mersedesTransmission.transmissionUp();

        mersedes.stop();

        System.out.println("Number of transmission -" + mersedes.getTransmission().getTransmission());
        System.out.println("Speed = " + mersedes.getSpeed());

        mersedesEengine.engineOff();
    }
}
