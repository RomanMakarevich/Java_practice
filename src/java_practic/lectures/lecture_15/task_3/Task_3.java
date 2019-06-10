package java_practic.lectures.lecture_15.task_3;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Word");
        words.add("Water");
        words.add("dog");
        words.add(null);
        words.add("wog");
        words.add("table");

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()){
            String element = iterator.next();

           if (element == null){
               iterator.remove();
           }else if (element.toLowerCase().startsWith("w")){
                iterator.remove();
            }
        }

        System.out.println(words);
    }
}
