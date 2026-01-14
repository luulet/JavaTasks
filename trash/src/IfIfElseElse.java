import java.util.Scanner;


public class IfIfElseElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int number = Integer.parseInt(scanner.nextLine());


        if (0 < number && number < 10) {
            System.out.println("Number has a value between 0 and 10");
            System.out.println();
        }

        System.out.println("Give another number");
        int number2 = Integer.parseInt(scanner.nextLine());

        if (number > number2) {
            System.out.println("The first number is bigger");
        }
        else if (number == number2) {
            System.out.println("Numbers have the same value");
        }
        else {
            System.out.println("The second number is bigger");
        }
    }
}

