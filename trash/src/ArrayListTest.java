import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> t = new ArrayList<>();
        while(true) {
            int luku = input.nextInt();
            if (luku < 0) {
                break;
            t.add(luku);
            }
        }

    }
}
