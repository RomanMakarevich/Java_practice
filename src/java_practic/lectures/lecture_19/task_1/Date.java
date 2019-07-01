package java_practic.lectures.lecture_19.task_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;

public class Date extends Calendar {


    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyy/mm/dd HH:mm:ss");
         Calendar cal = Calendar.getInstance();
        String time = dateFormat.format(cal).toString();
        return time;
    }

    @Override
    protected void computeTime() {


    }

    @Override
    protected void computeFields() {

    }

    @Override
    public void add(int field, int amount) {

    }

    @Override
    public void roll(int field, boolean up) {

    }

    @Override
    public int getMinimum(int field) {
        return 0;
    }

    @Override
    public int getMaximum(int field) {
        return 0;
    }

    @Override
    public int getGreatestMinimum(int field) {
        return 0;
    }

    @Override
    public int getLeastMaximum(int field) {
        return 0;
    }


}
