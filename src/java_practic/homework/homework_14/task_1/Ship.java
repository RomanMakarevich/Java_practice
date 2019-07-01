package java_practic.homework.homework_14.task_1;

public class Ship implements Runnable {

    private int cattying;
    private Tunnel tunnel;
    private Port port;


    public Ship(int cattying, Tunnel tunnel, Port port) {
        this.cattying = cattying;
        this.tunnel = tunnel;
        this.port = port;
    }

    @Override
    public void run() {
        tunnel.swimIn();
        port.load(cattying);
        tunnel.swimOut();
    }
}

