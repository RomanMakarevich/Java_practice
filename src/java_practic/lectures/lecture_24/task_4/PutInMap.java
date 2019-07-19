package java_practic.lectures.lecture_24.task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PutInMap {
    public void put (Food food, HashMap<String, List<String>> hashMap){
        if (hashMap.containsKey(food.getKind())){
            hashMap.get(food.getKind()).add(food.getWord());
        }else {
            hashMap.put(food.getKind(), new ArrayList<>());
            hashMap.get(food.getKind()).add(food.getWord());
        }
    }
}
