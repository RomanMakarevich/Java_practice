package java_practic.homework.homework_11.task_3;

import java.util.Comparator;

public class BuildingEntranceComparator implements Comparator<Building> {
    @Override
    public int compare(Building building1, Building building2) {
        if (building1.getEntrance() > building2.getEntrance()){
            return 1;
        }else if (building1.getEntrance() < building2.getEntrance()){
            return -1;
        }else {
            return 0;
        }
    }
}
