package Task1;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(10); // 10 total seats

        // 15 threads
        for (int i = 1; i <= 15; i++) {
            Thread customer = new Thread(new Customer(theater, i));
            customer.start();
        }
    }
}