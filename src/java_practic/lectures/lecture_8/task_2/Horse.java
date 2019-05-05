package java_practic.lectures.lecture_8.task_2;

public class Horse extends Animal {
    private int height;
    private boolean wearsHorseShoe;

    public Horse(int height, boolean wearsHorseShoe, String name, int age, String kind){
        super (name,age,kind);
        this.height = height;
        this.wearsHorseShoe = wearsHorseShoe;
    }
    public void printInfo(){
        System.out.printf("name - %s\nage - %d\nkind - %s\nheight - %d\n wearsHorseShoe - %s", name, age, kind, height, wearsHorseShoe);
    }

}
