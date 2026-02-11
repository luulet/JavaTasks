package Task1;

public class Theater {
    private int availableSeats;

    public Theater(int totalSeats) {
        this.availableSeats = totalSeats;
    }

    public synchronized boolean reserveSeats(int customerId, int seatsRequested) {
        if (availableSeats >= seatsRequested) {
            availableSeats -= seatsRequested;
            System.out.println("Customer " + customerId + " reserved " + seatsRequested + " tickets.");
            return true;
        } else {
            System.out.println("Customer " + customerId + " couldn't reserve " + seatsRequested + " tickets.");
            return false;
        }
    }
}