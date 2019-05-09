package java_practic.homework.homework_6.task_1;

public class Transmission {

    private int transmission;

    {
        transmission = 0;
    }

    public int getTransmission() {
        return transmission;
    }

    public void transmissionUp() {
        if (transmission < 7) {
            transmission++;
        } else {
            System.out.println("Maximum transmission reached");
        }
    }

    public void transmissionDown() {
        if (transmission > 0) {
            transmission--;
        } else {
            System.out.println("Minimum transmission reached");
        }
    }
}
