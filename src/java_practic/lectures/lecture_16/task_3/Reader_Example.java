package java_practic.lectures.lecture_16.task_3;


import java.io.*;

public class Reader_Example {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("D:\\Java_Practice\\src\\java_practic\\lectures\\lecture_16\\task_3\\File");
             BufferedReader br = new BufferedReader(fr)) {
            String i;
            while ((i = br.readLine()) != null) {
                System.out.println(i);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}



