public class ServiceRun {

    public static void main(String[] args) {

        Service servicePoint = new Service();

        CustomerGenerator.generateCustomers(servicePoint, 5);

        servicePoint.serve();


    }
}