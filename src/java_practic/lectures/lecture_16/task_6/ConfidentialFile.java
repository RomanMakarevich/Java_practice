package java_practic.lectures.lecture_16.task_6;

import java.io.*;

public class ConfidentialFile {
    private static final String FILE_PATH = "D:\\Java_Practice\\src\\java_practic\\lectures\\lecture_16\\task_6\\72154d888d16727fa89be7ad04b59d25.jpg";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH)){
            String code = "156984321584";

            fos.write(code.getBytes());
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(FILE_PATH)){
            BufferedReader br = new BufferedReader(fr);
            String readCode;

            readCode = br.readLine();
            System.out.println(readCode);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
