import java.util.LinkedList;
import java.util.Scanner;

public class CustomerRun {

    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("Choose action: 1 = Queue customer, 2 = Dequeue customer, 0 = Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Customer c = new Customer();
                    c.setStartTime(System.nanoTime());
                    queue.addFirst(c);
                    System.out.println("Customer queued. ID: " + c.getId());
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        Customer removed = queue.removeLast();
                        removed.setEndTime(System.nanoTime());
                        System.out.println("Customer dequeued. ID: " + removed.getId());
                        System.out.println("Time spent in queue (ns): " + removed.getTimeSpent());
                    }
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}