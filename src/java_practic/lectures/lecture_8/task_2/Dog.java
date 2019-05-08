package java_practic.lectures.lecture_8.task_2;

public class Dog extends Animal{
    private int lengthTail;
    private int numberOfTeeth;

    public void setLengthTail(int lengthTail) {
        this.lengthTail = lengthTail;
    }

    public int getLengthTail() {
        return lengthTail;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public Dog (int lengthTail, int numberOfTeeth, String name, int age, String kind){
        super(name,age,kind);
        this.lengthTail = lengthTail;
        this.numberOfTeeth = numberOfTeeth;
    }
    public void printInfo(){
        System.out.printf("name - %s\nage - %d\nkind - %s\nlengthTail - %d\n numberOfTeeth - %s", name, age, kind, lengthTail, numberOfTeeth);
    }
}
