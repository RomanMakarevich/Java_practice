package java_practic.lectures.lecture_7.task_2;

public class MainMetod {
    public static void main(String[] args) {
        Book book1 = new Book("Space", "Pushkin", 1233);

        String authorBook1 = book1.getAuthor();
        System.out.println("authorBook1 = " + authorBook1);

        Book book2 = new Book("Sea", "Nosov", 1426);

        String authorBook2 = book2.getAuthor();
        System.out.println("authorBook2 = " + authorBook2);

        authorBook1 = book1.setAuthor("Krylov");
        authorBook2 = book2.setAuthor("Blok");
        book2.text = "Bye world";

        String textBook1 = book1.text;
        String textBook2 = book2.text;

        System.out.println();
        System.out.printf("authorBook1 = %s\nauthorBook2 = %s\ntextBook1 = %s\ntextBook2 = %s", authorBook1, authorBook2, textBook1, textBook2);
    }
}
