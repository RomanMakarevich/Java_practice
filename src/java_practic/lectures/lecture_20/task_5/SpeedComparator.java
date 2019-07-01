package java_practic.lectures.lecture_20.task_5;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman o1, Sportsman o2) {
        if (o1.getSpeed() < o2.getSpeed()){
            return 1;
        }else if (o1.getSpeed() > o2.getSpeed()){
            return -1;
        }else {
            return 0;
        }
    }
}
