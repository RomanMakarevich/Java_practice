package java_practic.lectures.lecture_24.task_1;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Task_1 {
    private static final String FILE_PATH = "D:\\Java_Practice\\src\\java_practic\\lectures\\lecture_24\\task_1\\File";

    public static void main(String[] args) {
        try(FileReader fr = new FileReader(FILE_PATH)){
            BufferedReader br = new BufferedReader(fr);
            String strings;
            ArrayList<Person> persons = new ArrayList<>();
            while ((strings = br.readLine()) != null) {

                String[] arrayStrings = strings.split(",");

                for (int i = 0; i < arrayStrings.length; i++) {
                    arrayStrings[i] = arrayStrings[i].trim();
                }

                persons.add(new Person(arrayStrings[0], arrayStrings[1], arrayStrings[2], Integer.parseInt(arrayStrings[3])));
            }

           Map<String, IntSummaryStatistics> list =  persons.stream()
                   .collect(Collectors.groupingBy(Person::getCity, Collectors.summarizingInt(Person::getAge)));

            for (Map.Entry<String, IntSummaryStatistics> x:list.entrySet()){
                System.out.println("Average age:");
                System.out.println(x.getKey() + " - " + x.getValue().getAverage());
            }
            Map<String, List<Person>> treeMap = persons.stream()
                    .collect(Collectors.groupingBy(Person::getCity));

            for (Map.Entry<String, List<Person>> x:treeMap.entrySet()){
                System.out.println(x.getKey() + " - " + x.getValue());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
