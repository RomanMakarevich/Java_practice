package java_practic.lectures.lecture_13.task_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Task_1 {
    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {

            arrayList.add(0,i);
        }

        System.out.println(arrayList);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            if(iterator.next() % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
