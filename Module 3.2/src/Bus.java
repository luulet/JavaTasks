public class Bus implements Vehicle {
    public String type;
    public String fuel;
    public int capacity;

    public Bus(String type, String fuel, int capacity) {
        this.type = type;
        this.fuel = fuel;
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
