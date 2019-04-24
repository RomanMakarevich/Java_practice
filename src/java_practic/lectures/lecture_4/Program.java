package java_practic.lectures.lecture_4;

public class Program {
    public static void main(String[] args) {
        int [] array = new int [10];
        for (int i = 1; i<=array.length; i++){
            array [i-1] = i;
        }
        int sum = 0;

        for (int i = 0; i<array.length; i++){
            System.out.println(array[i] + ",");
            sum += array[i];
        }
        System.out.println("sum = " + sum);
    }
}
