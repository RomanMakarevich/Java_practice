package java_practic.homework.homework_10.task_2;

public class Library implements Cloneable{
    private Book book;
    private Magazine magazine;

    // не ошибка, но Book и Magazine можно передавать сразу в конструктор
    public Library(String nameBook, int ageBook, String authorBook, String nameMagazine, int ageMagazine, String authorMagazine){
        this.book = new Book(nameBook, ageBook, authorBook);
        this.magazine = new Magazine(nameMagazine, ageMagazine, authorMagazine);
    }

    @Override
    protected Library clone() throws CloneNotSupportedException {
        Library newLibrary = (Library)super.clone();
        newLibrary.book = (Book)super.clone();
        newLibrary.magazine = (Magazine) super.clone();

        return newLibrary;
    }

    @Override
    public String toString() {
        return book.toString() +"// , //"+ magazine.toString();

    }
}
