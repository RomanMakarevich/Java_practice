package java_practic.lectures.lecture_24.task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// PutInMap - хорошее название для метода, но не для класса. 
// Название класса - это имя существительное, например MapUtils
// Название метода - глагол, например, PutInMap, incrementByOne и т.д.

// я бы эту логику вынес в отдельный метод, для класса слишком
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
