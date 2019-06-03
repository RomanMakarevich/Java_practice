package java_practic.homework.homework_11.task_3;

import java.util.Comparator;

//Building; Street - внимательнее
public class BildingStretComparator implements Comparator<Building> {
    @Override
    public int compare(Building building1, Building building2) {
        return building1.getStreet().compareTo(building2.getStreet());
    }
}
