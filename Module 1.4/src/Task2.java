import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, k;

        System.out.print("Enter amount of integers to input: ");
        int numOfIntegers = Integer.parseInt(scanner.nextLine());
        int[] integers = new int[numOfIntegers];
        for (i = 1; i <= numOfIntegers; i++) {
            System.out.print("Enter integer: ");
            integers[i] = scanner.nextInt();

        }
        for (j = 1; j <= numOfIntegers; j++) {
            for (k = 1; k <= j; k++) {
                int maxsum = integers[j] + integers[k];
                if (maxsum < maxsum) {

                }
            }
        }
    }
}
