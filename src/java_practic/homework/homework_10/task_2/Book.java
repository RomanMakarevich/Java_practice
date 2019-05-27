package java_practic.homework.homework_10.task_2;

public class Book implements Cloneable {
    private String name;
    private int age;
    private Author author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author.setNameAuthor(author);
    }

    public Book(String name, int age, String author){
        this.name = name;
        this.age = age;
        this.author = new Author(author);
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        Book newBook = (Book) super.clone();
        newBook.author = (Author) super.clone();
        return newBook;
    }

    @Override
    public String toString() {
        return "Book - " + name + ", age - " + age + ", author - " + author;
    }
}
