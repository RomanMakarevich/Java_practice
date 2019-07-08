package java_practic.lectures.lecture_23.paterns.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        ITransport iTransport = TransportFactoty.getTransportFactoty(name);
        iTransport.deliver();

    }
}
