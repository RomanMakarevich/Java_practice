package java_practic.homework.homework_6.task_1;

public class Mersedes {
    public static void main(String[] args) {
        Engine mersedesEengine = new Engine();
        Transmission mersedesTransmission = new Transmission();
        Car mersedes = new Car("Mersedes", mersedesEengine, mersedesTransmission);

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
