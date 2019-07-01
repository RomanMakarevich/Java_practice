package java_practic.lectures.lecture_19.lambda;

public class LambdaApp {


    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Roman");
        System.out.println(user.getName());
    }

//    private static int sum (int[] numbers, Expression func){
//        int result = 0;
//        for (int i : numbers){
//            if (func.isEqual(i)){
//                result += i;
//            }
//        }
//        return result;
//    }
}
