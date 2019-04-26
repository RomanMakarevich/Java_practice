package java_practic.lectures.lecture_6;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,5,12,3,7};
        for (int a: array){
            if (a>10){
                continue;
            }
            System.out.println(a);
        }
    }
}
