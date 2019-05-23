package java_practic.lectures.lecture_10.task_1;

public class Outer {
    void outerMethod(){
        System.out.println("Method of outer class");
        class Inner{
            public void innerMethod(){
                System.out.println("Inner method");
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
        }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}

