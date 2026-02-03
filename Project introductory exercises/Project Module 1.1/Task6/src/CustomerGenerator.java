public class CustomerGenerator {

    public static void generateCustomers(Service s, int amount) {
        for (int i = 0; i < amount; i++) {
            Customer c = new Customer();
            c.setStartTime(System.nanoTime());
            s.addToQueueue(c);
        }
    }
}