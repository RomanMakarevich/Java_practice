package java_practic.homework.homework_5.task_3;

public class Task_3 {
    public static void main(String[] args) {
        int number = 0;

recursion(number);
    }

    static int recursion (int number){

        int[] array = {1,25,465,32,100};

        if (number < array.length){
            System.out.print(array[number] + ", ");
            return recursion(number +1);
        }
        else {
            return 0;
        }
    }

}
