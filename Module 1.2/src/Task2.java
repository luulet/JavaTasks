import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float leg_1;
        float leg_2;

        System.out.println("Enter length of the first leg");
        leg_1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter length of the second leg");
        leg_2 = Float.parseFloat(scanner.nextLine());

        double hypotenuse = Math.sqrt(Math.pow(leg_1,2) + Math.pow(leg_2,2));

        System.out.printf("The hypotenuse is %f\n", hypotenuse);

    }
}
