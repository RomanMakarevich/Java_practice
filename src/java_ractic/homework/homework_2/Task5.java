package java_ractic.homework.homework_2;

public class Task5 {
    public static void main(String[] args) {

        int duvider = 3;
        int residue;

        int[] numbers = new int[6];
        numbers[0] = 3;
        numbers[1] = 5;
        numbers[2] = 6;
        numbers[3] = 9;
        numbers[4] = 10;
        numbers[5] = 11;
        for (int i = 0; i<5; i++){
//         residue = numbers[i] % duvider;
         if (numbers[i] % duvider == 0){
             System.out.print(numbers[i] + ", ");
         }
        }

    }
}


