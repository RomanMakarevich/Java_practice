package java_practic.lectures.lecture_15.task_6;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//+
public class Task_6 {
    public static void main(String[] args) {

        String text = "While major gameplay components are already in place and functioning, players help is needed to add some of the smaller features and content. Of course polishing the overall experience is important at the same time. Game has been extensively tested in closed group, but it is always important to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to make the game as good as possible but without compromising the core idea.";

        find("alert", text);
        find("add", text);
        find("good", text);
        find("plan", text);
    }

    public static void find(String word, String text) {

        Pattern alert = Pattern.compile(word);
        Matcher matcher = alert.matcher(text);

        HashMap<String, Integer> words = new HashMap<>();

        while (matcher.find()) {
            if (words.containsKey(word)) {
                Integer number = words.get(word);
                words.put(word.toString(), ++number);
            } else {
                words.put(word.toString(), 1);
            }
        }
        System.out.println(words);
    }
}
