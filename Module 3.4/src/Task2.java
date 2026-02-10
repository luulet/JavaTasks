import java.io.FileWriter;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;

public class Task2 {
    public static void main(String[] args) {
        long[] fibonacci = new long[60];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < 60; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        String filePath = "C:\\Users\\Pelikone\\IdeaProjects\\JavaTasks\\Module 3.4\\fibonacci.csv";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Index,Fibonacci Number\n");

            for (int i = 0; i < fibonacci.length; i++) {
                writer.write((i + 1) + "," + fibonacci[i] + "\n");
            }

            System.out.println("CSV file created successfully at: " + filePath);

            File file = new File(filePath);
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file); // opens the csv file
            }

        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}
