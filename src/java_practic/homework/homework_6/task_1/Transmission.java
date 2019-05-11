package java_practic.homework.homework_6.task_1;

public class Transmission {

    private int numberOfTransmission;
    private final int zeroNumberOfTransmission;

    {
        numberOfTransmission = 0;
        zeroNumberOfTransmission = 0;
    }

    public int getNumberOfTransmission() {
        return numberOfTransmission;
    }

    public int getZeroNumberOfTransmission() {
        return zeroNumberOfTransmission;
    }

    public void transmissionUp() {
        if (numberOfTransmission < 7) {
            numberOfTransmission++;
        } else {
            System.out.println("Maximum numberOfTransmission reached");
        }
    }

    public void transmissionDown() {
        if (numberOfTransmission > zeroNumberOfTransmission) {
            numberOfTransmission--;
        } else {
            System.out.println("Minimum numberOfTransmission reached");
        }
    }
}
