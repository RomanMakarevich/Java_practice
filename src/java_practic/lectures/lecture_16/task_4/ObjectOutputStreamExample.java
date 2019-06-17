package java_practic.lectures.lecture_16.task_4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    private static final String FILE_PATH = "D:\\Java_Practice\\src\\java_practic\\lectures\\lecture_16\\task_4\\File";
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream(FILE_PATH)){
            ObjectOutputStream oos= new ObjectOutputStream(fos);

            Employee person = new Employee("Jake", 25, "Manager", 5);

            oos.writeObject(person);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
