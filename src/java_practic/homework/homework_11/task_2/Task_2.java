package java_practic.homework.homework_11.task_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("ivanov");
        students.add("sidorov");
        students.add("ivanov");
        students.add("makarevich");
        students.add("makarevich");

        // не стоит в названии указывать реализацию studentsHashMap. Просто students, максимум studentsMap
        HashMap < String, Integer> studentsHashMap = new HashMap<>();
        // temp - некорректное имя переменной, лучше student
        for (String temp : students){
            if (studentsHashMap.containsKey(temp)){
                Integer number = studentsHashMap.get(temp);
                studentsHashMap.put(temp, ++number);
            }else {
                studentsHashMap.put(temp, 1);
            }
        }
        System.out.println(studentsHashMap);
    }
}
