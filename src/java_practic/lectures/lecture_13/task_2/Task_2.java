package java_practic.lectures.lecture_13.task_2;


import java.util.Iterator;
import java.util.LinkedList;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100; i++) {

            linkedList.add(i);
        }
        System.out.println(linkedList);

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            if (iterator.next() > 25){
                iterator.remove();
            }
        }
        System.out.println(linkedList);
    }
}
