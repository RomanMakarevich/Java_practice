package java_practic.lectures.lecture_5.lec_5.task_2;


public class Task_2 {
    public static void main(String[] args) {
        int[] array = new int[5];

int max = 0;
int min = 100;
           for (int i = 0; i < array.length; i++){
               array[i] = Integer.parseInt (args[i]);
               System.out.println(array[i]);
           }
           for (int i = 0; i < array.length; i++){
               if (max < array[i]){
                   max = array[i];
               }
           }
        System.out.println("max = " + max);
           for (int i = 0; i < array.length; i++){
               if (min > array[i]){
                   min = array[i];
               }
           }
        System.out.println("min = " + min);


        }
    }
