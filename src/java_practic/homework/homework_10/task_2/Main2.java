package java_practic.homework.homework_10.task_2;

public class Main2 {
    public static void main(String[] args) {
        Library library1 = new Library("Book", 215, "Turgenev","Magazine", 2019, "somebody");
        //Вроде бы сделал всё как в примере, но почему-то класс не поддерживает клонирование.
       // Library library2 = library1.clone();
        
        // сделай метод clone() public 
        System.out.println(library1.toString());

    }
}
