package java_practic.lectures.lecture_5;

import java.util.Scanner;

public class Task_a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i=0; i<nums.length; i++){
            System.out.println("Введите число:");
            nums [i] = in.nextInt();
        }
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
