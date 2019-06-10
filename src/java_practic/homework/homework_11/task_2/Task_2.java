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
        HashMap < String, Integer> studentsMap = new HashMap<>();
        // temp - некорректное имя переменной, лучше student
        for (String student : students){
            if (studentsMap.containsKey(student)){
                Integer number = studentsMap.get(student);
                studentsMap.put(student, ++number);
            }else {
                studentsMap.put(student, 1);
            }
        }
        System.out.println(studentsMap);
    }
}
