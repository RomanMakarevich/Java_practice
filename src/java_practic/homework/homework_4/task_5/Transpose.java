package java_practic.homework.homework_4.task_5;


public class Transpose {
    public static void main(String[] args) {
        int[][] array = {{1,3,-7}, {0,2,8}, {-5,1,0}};
int buf;
        System.out.println("array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("arrayTtansposed:");

        for (int i = 0; i < array.length; i++){
            int j = 0;
            if (i > 0){
                j = i;
            }
            for (;j < array[i].length; j++){
               buf = array[i][j];
               array[i][j] = array[i-i+j][j-j+i];
               array[i-i+j][j-j+i] = buf;

            }
        }
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
