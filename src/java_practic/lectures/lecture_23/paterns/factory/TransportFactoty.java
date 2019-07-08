package java_practic.lectures.lecture_23.paterns.factory;

public class TransportFactoty {

    static ITransport getTransportFactoty(String name) {
        ITransport iTransport = null;
        switch (name) {
            case "truck":
                iTransport = new Truck();
                break;
            case "Ship":
                iTransport = new Ship();
                break;
            case "plane":
                iTransport = new Plane();
            default:
                System.out.println("Unknoun trabsport");
        }
        return iTransport;
    }
}
