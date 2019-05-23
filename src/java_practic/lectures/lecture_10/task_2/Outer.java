package java_practic.lectures.lecture_10.task_2;

public class Outer {
    static Demo demo = new Demo(){
        @Override
        public void show(){
            super.show();
            System.out.println("Pereopredelili metod");
        }
    };

    public static void main(String[] args) {
        demo.show();
    }
}
