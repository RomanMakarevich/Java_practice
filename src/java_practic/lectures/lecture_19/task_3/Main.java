package java_practic.lectures.lecture_19.task_3;

public class Main {
    public static void main(String[] args) {


    String string = "taC";
    ReversString reversString = (sring -> {
        StringBuilder stringBuilder = new StringBuilder(sring);
        stringBuilder.reverse();
        return stringBuilder;
    });
        System.out.println(reversString.revers(string));
}}
