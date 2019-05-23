package java_practic.lectures.lecture_10.task_4;

public class Main {

    static void read(Printable p){
        p.print();
    }

    static Printable createPrintable(String name, boolean option){
        if (option){
            return new Book("name", "author", 1854);
        }else {
            return new Magazine("name");
        }
    }
    public static void main(String[] args){
        Printable printable = createPrintable("Компьютерра", false);
        read(new Book("Отцы и дети", "Тургенев", 1882));
        System.out.println();
        read(new Magazine("Хвкер"));

        Printable p = new Printable(){};
        p.print();
        Printable.read();
    }
}
