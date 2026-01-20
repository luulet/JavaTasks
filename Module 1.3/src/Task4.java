import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int ans;
        while (true) {

            int score = 0;
            for (i = 1; i <= 10; i++) {
                int num_1 = (int) (Math.random() * 10) + 1;
                int num_2 = (int) (Math.random() * 10) + 1;
                System.out.print(num_1 + " * " + num_2 + " = ");
                ans = num_1 * num_2;
                int userans = Integer.parseInt(scanner.nextLine());
                if (userans == ans) {
                    score = score + 1;
                }

            }
            System.out.print("score: " + score + "\n");
            if (score == 10) {
                System.out.println("Congratulations! You have mastered multiplication tables!");
                break;
            }
            else {
                System.out.print("Let's try to get a perfect score!\n");
            }
        }
    }
}
