import java.util.Scanner;

class ArrayTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of integers: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter integers: ");

        for (int i = 0; i < size; i++) {

            numbers[i] = scanner.nextInt();
        }

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }


    }
}



