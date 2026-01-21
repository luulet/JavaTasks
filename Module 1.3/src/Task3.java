import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a start value: ");
        int num_1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter an end value: ");
        int num_2 = Integer.parseInt(scanner.nextLine());
        int i;
        int j;
        int flg;

        for (i = num_1; i <= num_2; i++) {
            if (i == 0)
                continue;


            flg = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1) {
                System.out.println(i);
            }
        }
    }
}
