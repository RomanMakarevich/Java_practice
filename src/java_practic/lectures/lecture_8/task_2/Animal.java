package java_practic.lectures.lecture_8.task_2;

public class Animal {
    protected String name;
    protected int age;
    protected String kind;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public Animal (String name, int age, String kind){
        this.name = name;
        this.age = age;
        this.kind = kind;
    }
}
