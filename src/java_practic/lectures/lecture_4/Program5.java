package java_practic.lectures.lecture_4;

public class Program5 {
    public static void main(String[] args) {
        int [][] twoDimArray = new int[3][4];
        int [][] twoDimArray2 = {{1,2,3,4} , {5,6,7,8}, {9,10,11,12}};

        for (int i = 0; i < twoDimArray2.length; i++) {

            for (int j = 0; j < twoDimArray2[i].length; j++){
                System.out.print(twoDimArray2[i][j] + ",");
            }
            System.out.println();
        }
    }
}
