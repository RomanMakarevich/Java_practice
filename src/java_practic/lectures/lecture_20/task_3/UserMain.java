package java_practic.lectures.lecture_20.task_3;

public class UserMain {
    public static void main(String[] args) {
        UserMaker userMaker = User::new;

        User mazay = userMaker.make("Mazay");
        // System.out.println(mazay); <- метод toString() вызовется автоматически
        System.out.println(mazay.toString());
    }
}
