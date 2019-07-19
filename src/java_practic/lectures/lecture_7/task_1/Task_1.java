package java_practic.lectures.lecture_7.task_1;

public class Task_1 {
    public static void main(String[] args) {

        Book luna = new Book("Luna", "Pushkin", 1912);
        String name = luna.getName();
        String author = luna.getAuthor();
        int year = luna.getYear();
        System.out.printf("%s, %s, %d", name, author, year);

        Book sun = new Book(1236);
        //String sunName = sun.getWord();
        //System.out.println("\n"+sunName);
        String sunName = sun.setName("Sun");
        System.out.printf("\n" + sunName);

    }
}
