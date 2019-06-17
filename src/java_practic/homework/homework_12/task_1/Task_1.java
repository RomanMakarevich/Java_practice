package java_practic.homework.homework_12.task_1;

import java.io.*;

public class Task_1 {
    private static final String TEXT_PATH = "D:\\Java_Practice\\src\\java_practic\\homework\\homework_12\\task_1\\Text";
    private static final String TEXT1_PATH = "D:\\Java_Practice\\src\\java_practic\\homework\\homework_12\\task_1\\Text1";

    public static void main(String[] args) {

        int buf = 0;
        int counter = 0;
        try (FileReader fr = new FileReader(TEXT_PATH)) {
            BufferedReader br = new BufferedReader(fr);

            FileOutputStream fos = new FileOutputStream(TEXT1_PATH);
            PrintStream ps = new PrintStream(fos);

            while ((buf = br.read()) != -1) {

                if (buf == (char) ' ') {

                    if (counter == 5) {
                        ps.println();
                        counter = 0;
                    } else {
                        ps.print(", ");
                        counter++;
                    }
                } else {
                    ps.print((char) buf);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
