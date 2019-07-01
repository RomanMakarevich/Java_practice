package java_practic.lectures.lecture_20.task_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sportsman> sportsmans = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            sportsmans.add(new Sportsman(i + 1));
        }

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int maxSpeed = 35;

            sportsmans.get(i).setSpeed(random.nextInt(maxSpeed));
        }
        System.out.println(sportsmans);
        System.out.println();
        Comparator sportsmanComp = new SpeedComparator().thenComparing(new NameComparator());

        TreeSet<Sportsman> sortedSportsmans = new TreeSet<>(sportsmanComp);
        sortedSportsmans.addAll(sportsmans);

        sportsmans.clear();
        sportsmans.addAll(sortedSportsmans);
        sportsmans.get(0).setMedals(1, Medals.Gold);
        sportsmans.get(1).setMedals(1, Medals.Silver);
        sportsmans.get(2).setMedals(1, Medals.Huron);

        System.out.println(sportsmans);
    }
}
