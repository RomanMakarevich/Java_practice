package java_practic.homework.homework_6.task_1;

public class Car {

    private String brand;
    // engine - должен быть класс Engine, внутри которого методы заглушить и завести
    private boolean engine;
    //тоже отдельный класс Transmission, а уже внутри класса Car переменная
    // private Transmission transmission;

    // и Engine и Transmission лучше передать через конструктор, т.е.
    /*
    public Car (Engine engine, Transmission transmission){
     this.transmission = transmission;
     this.engine = engine;
    }
    */
    private int transmission;
    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getTransmission() {
        return transmission;
    }

    public int getSpeed() {
        return speed;
    }

    {
        engine = false;
        transmission = 0;
        speed = 0;

    }

    public Car(String brand) {
        this.brand = brand;
    }

    public void engineOn() {
        if (engine == false) {
            engine = true;
        } else {
            System.out.println("Action is not available, engine - On.");
        }
    }

    public void engineOff() {
        if (engine == true) {
            engine = false;
        } else {
            System.out.println("Action is not available, engine - Off.");
        }
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

    public void gasPedalOn() {
        if (engine == true) {
            if (0 < transmission) {
                speed = transmission * 20;
                System.out.printf("Speed = %d\nNumber of transmission - %d\n", speed, transmission);
            } else {
                System.out.println("It's impossible. Check the transmission.");
            }
        } else {
            System.out.println("It's impossible. The engine is stopped.");
        }
    }

    public void stop() {
        while (transmission > 0) {
            transmissionDown();
            speed = transmission * 20;
        }
    }
}
