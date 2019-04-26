package java_practic.lectures.lecture_5.lec_7.task_4;

public class Task_4 {
    public static void main(String[] args) {
        myMetod(20,12,14,587,6,41);
    }
    static  void myMetod (int ...nums){
        for (int x:nums){
            System.out.print(x + ", ");
        }

    }
}
