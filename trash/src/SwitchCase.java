import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type test or test2");
        System.out.print(": ");
        String name = scanner.nextLine();

        switch (name) {
            case "test":
                System.out.println("test");
                break;
            case  "test2":
                System.out.println("test2");
                break;
            default:
                System.out.println("input is something else");
        }
    }
}
