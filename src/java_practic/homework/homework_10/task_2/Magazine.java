package java_practic.homework.homework_10.task_2;

public class Magazine implements Cloneable {
    private String name;
    private int age;
    private Author author;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAuthor(String author) {
        this.author.setNameAuthor(author);
    }

    public Author getAuthor() {
        return author;
    }
    public Magazine (String name, int age, String author){
        this.name = name;
        this.age = age;
        this.author = new Author(author);
    }

    @Override
    public Magazine clone() throws CloneNotSupportedException {
        Magazine newMagazine = (Magazine) super.clone();
        newMagazine.author = (Author) super.clone();
        return newMagazine;
    }

    @Override
    public String toString() {
        return "Book - " + name + ", age - " + age + ", author - " + author;
    }
}
