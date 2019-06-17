package java_practic.lectures.lecture_16.task_4;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    public int age;
    private Work work;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Employee(String name, int age, String nameWork, int experience) {
        this.name = name;
        this.age = age;
        this.work = new Work(nameWork, experience);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", work=").append(work);
        sb.append('}');
        return sb.toString();
    }
}
