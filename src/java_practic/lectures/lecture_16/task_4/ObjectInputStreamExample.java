package java_practic.lectures.lecture_16.task_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    private static final String FILE_PATH = "D:\\Java_Practice\\src\\java_practic\\lectures\\lecture_16\\task_4\\File";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(FILE_PATH)){
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee newPerson = (Employee)ois.readObject();

            System.out.println(newPerson.toString());



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
