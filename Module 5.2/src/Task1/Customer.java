package Task1;

public class Customer implements Runnable {
    private Theater theater;
    private int customerId;

    public Customer(Theater theater, int customerId) {
        this.theater = theater;
        this.customerId = customerId;
    }

    @Override
    public void run() {
        // Random number of seats to reserve (1-4)
        int seatsToReserve = (int) (Math.random() * 4) + 1;
        theater.reserveSeats(customerId, seatsToReserve);
    }
}