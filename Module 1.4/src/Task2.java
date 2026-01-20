import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, k;

        System.out.print("Enter amount of integers to input: ");
        int numOfIntegers = Integer.parseInt(scanner.nextLine());
        int[] integers = new int[numOfIntegers];
        for (i = 0; i < numOfIntegers; i++) {
            System.out.print("Enter integer: ");
            integers[i] = scanner.nextInt();

        }
        int maxsum =Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        for (j = 0; j < numOfIntegers; j++) {
            int currentSum = 0;
            for (k = j; k < numOfIntegers; k++) {
                currentSum += integers[k];

                if (currentSum > maxsum) {
                    maxsum = currentSum;
                    startIndex = j;
                    endIndex = k;

                }
            }
        }
        System.out.println("\nMaximum sum: " + maxsum);
        System.out.println("Integers: " + (startIndex + 1) + "-" + (endIndex + 1));
    }
}
