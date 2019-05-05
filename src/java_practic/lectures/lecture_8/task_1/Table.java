package java_practic.lectures.lecture_8.task_1;

public class Table {
    int size;
    String color;
    static int counter;

    public Table(int size, String color){
        this.size = size;
        this.color = color;
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}
