package java_practic.lectures.lecture_16.task_4;

import java.io.Serializable;

public class Work implements Serializable {
    private String name;
    private int experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Work(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Work{");
        sb.append("name='").append(name).append('\'');
        sb.append(", experience=").append(experience);
        sb.append('}');
        return sb.toString();
    }
}
