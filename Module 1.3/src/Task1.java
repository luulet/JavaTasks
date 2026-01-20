import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients for the quadratic equation (ax^2 + bx + c)");
        System.out.print("a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("c: ");
        double c = Double.parseDouble(scanner.nextLine());
        double check = Math.pow(b, 2) - 4 * a * c;

        if (check > 0) {
            double root_1 = ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
            double root_2 = ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
            System.out.printf("%.2f %.2f", root_1, root_2);
        }
        else if (check < 0) {
            System.out.println("No real roots.");
        }
        else if (check == 0) {
            double root_1 = -b/(2*a);
            System.out.printf("%.2f",root_1);
        }



        /*if (Math.floor(root_1)) {

        }

         */

    }

}
