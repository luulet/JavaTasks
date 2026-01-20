import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luoti;
        double naula;
        double leiviska;

        System.out.print("Enter grams\n");
        double gram = Double.parseDouble(scanner.nextLine());

        luoti = gram / 13.28;
        naula = Math.floor(luoti / 32);
        leiviska = Math.floor(naula / 20);

        luoti = luoti % 32;
        naula = naula % 20;

        System.out.printf("%.2f grams convert to %.0f leiviskä, %.0f naula," +
                " and %.2f luoti.", gram, leiviska, naula, luoti);




    }
}
