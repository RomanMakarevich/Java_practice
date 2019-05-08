package java_practic.homework.homework_6.task_1;

public class Mersedes {
    public static void main(String[] args) {
        Car mersedes = new Car("Mersedess");

        mersedes.gasPedalOn();
        mersedes.engineOn();
        mersedes.gasPedalOn();

        mersedes.transmissionUp();
        mersedes.gasPedalOn();

        mersedes.transmissionUp();
        mersedes.gasPedalOn();

        mersedes.transmissionUp();
        mersedes.gasPedalOn();

        mersedes.transmissionUp();
        mersedes.gasPedalOn();

        mersedes.transmissionUp();
        mersedes.gasPedalOn();

        mersedes.transmissionUp();
        mersedes.gasPedalOn();

        mersedes.transmissionUp();
        mersedes.gasPedalOn();

        mersedes.transmissionUp();

        mersedes.stop();
        mersedes.engineOff();
        System.out.println("Number of transmission - " + mersedes.getTransmission());
        System.out.println("Speed = " + mersedes.getSpeed());
    }
}
