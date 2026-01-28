import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("test.txt")) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        try (Reader reader = new FileReader("test.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
