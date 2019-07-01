package java_practic.lectures.lecture_20.task_5;

import java.util.HashMap;

public class Sportsman{
    private int speed;
    private int name;
    private HashMap<Integer
            , Medals> medals;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public HashMap getMedals() {
        return medals;
    }

    public void setMedals(Integer number, Medals medals)
    {
        this.medals.put(number, medals);
    }

    public Sportsman(int name) {
        this.speed = 0;
        this.name = name;
        this.medals = new HashMap();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sportsman{");
        sb.append(", name='").append(name).append('\'');
        sb.append("speed=").append(speed);
        sb.append(", medals=").append(medals);
        sb.append('}');
        return sb.toString();
    }


}
