package java_practic.lectures.lecture_20.task_5;

import java.util.Comparator;

public class NameComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman o1, Sportsman o2) {
        if (o1.getName() < o2.getName()){
            return -1;
        }else if (o1.getName() > o2.getName()){
            return 1;
        }else {
            return 0;
        }
    }
}
