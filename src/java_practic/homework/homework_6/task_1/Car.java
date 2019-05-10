package java_practic.homework.homework_6.task_1;

public class Car {

    private String brand;
    // engine - должен быть класс Engine, внутри которого методы заглушить и завести
    
    // просто private Engine engine; У самого двигателя есть статус, но переменную так называть будет некорректно
    private Engine engineStatus;
    //тоже отдельный класс Transmission, а уже внутри класса Car переменная
    // private Transmission transmission;
    private Transmission transmission;

    // и Engine и Transmission лучше передать через конструктор, т.е.
    /*
    public Car (Engine engine, Transmission transmission){
     this.transmission = transmission;
     this.engine = engine;
    }
    */

    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public Engine getEngineStatus() {
        return engineStatus;
    }

    public Transmission getTransmission() {
        return transmission;
    }
// сначала в классе должны быть блоки инициализации, затем конструкторы, затем публичные методы и затем приватные
    // Это просто такое общее правило размещения
    {
        speed = 0;
    }

    public Car(String brand, Engine engineStatus, Transmission transmission) {
        this.brand = brand;
        this.engineStatus = engineStatus;
        this.transmission = transmission;
    }

    // 
    public void gasPedalOn() {
        if (engineStatus.getEngineStatus() == true) {
            //getTransmission - этот метод должен вызываться у того, у чего есть трансмиссия, т.е. в у машины
            // а не у самой трансмиссии. Если ты имел ввиду передачу, то переименуй метод
            // 0 - вынеси в отдельную переменную и назови, не должно быть таких непонятных чисел
            if (0 < transmission.getTransmission()) {
                // тоже самое. переименуй методе
                speed = transmission.getTransmission() * 20;
                System.out.printf("Speed = %d\nNumber of transmission - %d\n", speed, transmission.getTransmission());
            } else {
                System.out.println("It's impossible. Check the transmission.");
            }
        } else {
            System.out.println("It's impossible. The engine is stopped.");
        }
    }

    public void stop() {
        while (transmission.getTransmission() > 0) {
            transmission.transmissionDown();
            speed = transmission.getTransmission() * 20;
        }
    }
}
