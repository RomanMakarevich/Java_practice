package java_practic.lectures.lecture_24.task_4;

import java.util.*;

public class Task_4 {
    public static void main(String[] args) {

        PutInMap putInMap = new PutInMap();
        Random random = new Random();
        HashMap<String, List<String>> mapa = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String kind = null;
            String word = null;
            switch (random.nextInt(2)) {

                case 0:
                    kind = "fruit";
                    switch (random.nextInt(5)) {
                        case 0:
                            word = "apple";
                            break;
                        case 1:
                            word = "orange";
                            break;
                        case 2:
                            word = "banana";
                            break;
                        case 3:
                            word = "pear";
                            break;
                        case 4:
                            word = "pineapple";
                            break;
                    }
                    break;
                case 1:
                    kind = "vegetable";
                    switch (random.nextInt(5)) {
                        case 0:
                            word = "potato";
                            break;
                        case 1:
                            word = "tomato";
                            break;
                        case 2:
                            word = "cucumber";
                            break;
                        case 3:
                            word = "cabbage";
                            break;
                        case 4:
                            word = "pepper";
                            break;
                    }
                    break;
            }
            Food food = new Food(kind, word);
            putInMap.put(food, mapa);
        }
        System.out.println(mapa);
    }
}
