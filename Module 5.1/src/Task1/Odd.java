package Task1;

public class Odd extends Thread{
    private int limit;

    public Odd(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 0; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}
