package java_practic.lectures.lecture_10.task_4;

public class Book implements Openable, Printable {

    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void print() {
        System.out.printf("Book %s(author %s) was printed in %d year", name, author, year);
    }

    @Override
    public void open() {
        System.out.println("Book open");
    }

    @Override
    public void close() {
        System.out.println("Book close");
    }
}
