package java_practic.homework.homework_10.task_2;

public class Author implements Cloneable {
    private String nameAuthor;

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String name){
        this.nameAuthor = name;
    }
    public Author (String nameAuthor){
        this.nameAuthor = nameAuthor;
    }

    @Override
    public Author clone() throws CloneNotSupportedException {
        return (Author) super.clone();
    }

    @Override
    public String toString() {
        return nameAuthor;
    }
}
