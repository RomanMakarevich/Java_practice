package java_practic.lectures.lecture_10.task_4;

interface Printable {
    default void print(){
        System.out.println("Unknown ptinted edition");
    }
    static void read(){
        System.out.println("Read unknown edition");
    }
}
