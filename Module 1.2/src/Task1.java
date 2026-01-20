import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit");
        float fahrenheit = Float.parseFloat(scanner.nextLine());
        float celsius = ((fahrenheit - 32f)/1.8f);
        System.out.printf("Temperature in fahrenheit: %.1f. Temperature in celsius: %.1f", fahrenheit, celsius);
    }
}
