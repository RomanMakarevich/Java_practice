package java_practic.lectures.lecture_12.test24_05_19.task_2;

public class Scholar {
    private int id;



    public void definition(){
       id = ScholarSchedule.id();
        if ((Days.values()[id].toString().equals("saturday"))){
            System.out.println("you can sleep");
        }else {
            System.out.println("go to school!");
        }
    }
}
