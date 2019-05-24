package java_practic.lectures.lecture_12.task_1;

import java.util.Objects;

public class Student {
    private int age;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }

    public Student (int age){
        this.age = age;
    }


}
