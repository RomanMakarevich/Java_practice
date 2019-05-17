package java_practic.lectures.lecture_9.task_1;

public abstract class AbstractClass {
    public abstract void show();

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass(){
            @Override
            public void show() {
                System.out.println(7);
            }
        };
        abstractClass.show();
    }

}

