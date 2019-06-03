package java_practic.homework.homework_11.task_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Task_3 {
    public static void main(String[] args) {
        Comparator<Building> bcomp = new  BildingStretComparator().thenComparing(new BuildingEntranceComparator());
        ArrayList<Building> buildings = new ArrayList<>();
        buildings.add(new Building("green", 4));
        buildings.add(new Building("red", 6));
        buildings.add(new Building("red", 4));
        buildings.add(new Building("green", 8));

        System.out.println(buildings);

        /* посмотри как я предложил сделать в классе Building. Так гораздо удобнее + тебе не понадобится каждый раз передавать 
        comparator.
        */
        TreeSet <Building> buildingTreeSet = new TreeSet<>(bcomp);
        buildingTreeSet.addAll(buildings);

        System.out.println(buildingTreeSet);



    }
}
