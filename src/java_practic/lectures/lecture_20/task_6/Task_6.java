package java_practic.lectures.lecture_20.task_6;

import java.util.ArrayList;
import java.util.Collections;

public class Task_6 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Jack Sparrou");
        strings.add("Kraken");
        strings.add("Black pearl");

        ListComparator lc = newArrayList -> {
            ArrayList buf = new ArrayList();
            buf.addAll(strings);
            Collections.reverse(buf);

            return buf;
        };
        System.out.println(lc.lostComparator(strings));
    }
}
