package Task1;

public class Even extends Thread{
    private int limit;

    public Even(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}
