public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus(String fuel, int capacity) {
        super("Bus", fuel);
        this.capacity = capacity;
    }
    public void start() {
        System.out.println("Bus is starting...");
    }
    public void stop() {
        System.out.println("Bus is stopping...");
    }
    public String getInfo() {
        return String.format("Bus information:" + "\n" + "Type: " + this.type + "\n" + "Fuel: " + this.fuel + "\n" + "Capacity: " + this.capacity + " passengers");
    }
}
