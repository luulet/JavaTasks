import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of integers to input: ");
        int i, j;
        int numOfIntegers = Integer.parseInt(scanner.nextLine());
        int[] integers = new int[numOfIntegers];
        for (i = 0; i < numOfIntegers; i++) {
            System.out.print("Enter integer: ");
            integers[i] = scanner.nextInt();
        }
        int[] unique = new int[numOfIntegers];
        int uniqueCount = 0;

        for (i = 0; i < numOfIntegers; i++) {
            boolean isDuplicate = false;

            for (j = 0; j < numOfIntegers; j++) {
                if (integers[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unique[uniqueCount] = integers[i];
                uniqueCount++;
            }
        }

        System.out.println("The array without duplicates: ");
        for (i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + ", ");
        }
    }
}
