package java_practic.lectures.lecture_19.task_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {



        Time time = () -> {
            DateFormat dateFormat = new SimpleDateFormat("yyy/mm/dd HH:mm:ss");
            java.util.Date date = new Date();
            return dateFormat.format(date);
        };
        System.out.println(time.date());
    }
}
