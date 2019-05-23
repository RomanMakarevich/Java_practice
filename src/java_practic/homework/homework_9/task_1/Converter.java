package java_practic.homework.homework_9.task_1;

import java.util.Scanner;

public class Converter implements InterfaceConverter {

    private int id;
    private int sum;
    private double usd;
    private double eur;
    private double rus;

    public Converter(double usd, double eur, double rus) {
        this.usd = usd;
        this.eur = eur;
        this.rus = rus;
    }

    @Override
    public void converter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of cuttency");
        System.out.printf("0.USD\n1.EUR\n2.RUS");
        id = scanner.nextInt();
        System.out.println("currency selected - " + Currency.values()[id]);
        System.out.println("enter sum");
        sum = scanner.nextInt();
        if (Currency.values()[id].toString().equals("USD")) {
            System.out.println(usd(sum, usd) + " BYN");
        } else if (Currency.values()[id].toString().equals("EUR")) {
            System.out.println(eur(sum, eur) + " BYN");
        } else if (Currency.values()[id].toString().equals("RUS")) {
            System.out.println(rus(sum, rus) + " BYN");
        }
    }

    @Override
    public double usd(int sum, double usd) {
        return (sum * usd);
    }

    @Override
    public double eur(int sum, double eur) {
        return sum * eur;
    }

    @Override
    public double rus(int sum, double rus) {
        return sum / rus;
    }

    enum Currency {
        USD,
        EUR,
        RUS
    }
}
