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

        // i < 10 = и цикл до этого тоже 10. 
        // sportsmans.size()
        for (int i = 0; i < 10; i++) {
            // вынеси за пределы цикла. зачем каждый раз создавать переменную
            int maxSpeed = 35;

            // скорость в конструктор и сразу за 1 цикл все сделаешь.
            sportsmans.get(i).setSpeed(random.nextInt(maxSpeed));
        }
        System.out.println(sportsmans);
        System.out.println();
        // получается, прибежал одинаково с соперником, но имя на "Я" и в итоге медаль ниже рангом? 
        Comparator sportsmanComp = new SpeedComparator().thenComparing(new NameComparator());

        TreeSet<Sportsman> sortedSportsmans = new TreeSet<>(sportsmanComp);
        sortedSportsmans.addAll(sportsmans);

        // не стоит так делать с базовой коллекцией. Переопредели метод equals,hashcode и затем бери из листа нужного бегуна и сетай ему медаль
        sportsmans.clear();
        sportsmans.addAll(sortedSportsmans);
        sportsmans.get(0).setMedals(1, Medals.Gold);
        sportsmans.get(1).setMedals(1, Medals.Silver);
        sportsmans.get(2).setMedals(1, Medals.Huron);

        System.out.println(sportsmans);
    }
}
