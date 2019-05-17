package java_practic.lectures.lecture_8.task_2;

public class Cat extends Animal {
    private int lengthClutch;
    private String color;

    public void setLengthClutch(int lengthClutch) {
        this.lengthClutch = lengthClutch;
    }

    public int getLengthClutch() {
        return lengthClutch;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Cat(int lengthClutch, String color, String name, int age, String kind) {
        super(name, age, kind);
        this.lengthClutch = lengthClutch;
        this.color = color;
    }

    public void printInfo() {
        System.out.printf("name - %s\nage - %d\nkind - %s\nlengthClutch - %d\n color - %s", name, age, kind, lengthClutch, color);
    }

}
