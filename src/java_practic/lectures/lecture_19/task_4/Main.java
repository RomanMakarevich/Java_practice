package java_practic.lectures.lecture_19.task_4;

public class Main {
    private int allsum = 0;
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        Sum sum = () -> {
            int result = 0;
            for(int i : array){
                if(IsOdd.isOdd(i)){
                    result += i;
                }
            }
            return result;
        };

        System.out.println(sum.sum());
    }
}
