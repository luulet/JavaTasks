import java.util.LinkedList;

public class Service {

    private LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueueue(Customer a) {
        queue.addFirst(a);
    }

    public Customer removeFromQueueue() {
        return queue.removeLast();
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer c = removeFromQueueue();

            long serviceStart = System.nanoTime();

            long sleepTime = (long) (Math.random() * 1_000_000_000);
            try {
                Thread.sleep(sleepTime / 1_000_000); // ns → ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long serviceEnd = System.nanoTime();
            c.setEndTime(serviceEnd);

            long serviceTime = serviceEnd - serviceStart;
            long responseTime = c.getTimeSpent();

            System.out.println("Customer ID: " + c.getId());
            System.out.println("Service time (ns): " + serviceTime);
            System.out.println("Response time (ns): " + responseTime);
            System.out.println();

            long averageServiceTime = serviceTime / c.getId();
            System.out.println("Average service time (ns): " + averageServiceTime);
            System.out.println(c.getId());
        }
    }
}