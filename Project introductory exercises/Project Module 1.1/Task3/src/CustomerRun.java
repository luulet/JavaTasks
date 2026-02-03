public class CustomerRun {
    public static void main(String[] args) throws InterruptedException {

        Customer c1 = new Customer();
        c1.setStartTime(System.currentTimeMillis());

        Thread.sleep(300);

        c1.setEndTime(System.currentTimeMillis());

        System.out.println("Customer ID: " + c1.getId());
        System.out.println("Time spent (ms): " + c1.getTimeSpent());

        Customer c2 = new Customer();
        c2.setStartTime(System.currentTimeMillis());
        Thread.sleep(700);
        c2.setEndTime(System.currentTimeMillis());
        System.out.println("Customer ID: " + c2.getId());
        System.out.println("Time spent (ms): " + c2.getTimeSpent());
    }
}