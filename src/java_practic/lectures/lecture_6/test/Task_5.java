package java_practic.lectures.lecture_6.test;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < array.length; i++){
            if(i>4){
                break;
            }
            System.out.print(array[i] + ", ");
        }
    }
}
