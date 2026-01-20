import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstNames = {"Aapo", "Juhani", "Juha", "Hannes", "Sampo", "Tapio", "Matti", "Matias", "Antti", "Oliver", "Ilmari", "Santeri", "Eero"};
        String[] lastNames = {"Korhonen", "Virtanen", "Mäkinen", "Mäkelä", "Laine", "Heikkinen", "James", "Järvinen", "Salonen", "Turunen", "Lehtonen", "Ojala", "Saarela"};
        int i;
        System.out.println("Count of random names to be generated: ");
        int nameCount = Integer.parseInt(scanner.nextLine());
        for (i = 1; i <= nameCount; i++) {

            System.out.print(firstNames[(int) (Math.random() * 13 )] + " " + lastNames[(int) (Math.random() * 13 )] + "\n");
        }
    }
}
