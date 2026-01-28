public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String fuel, String color) {
        super("Motorcycle", fuel);
        this.color = color;
    }
    public void start() {
        System.out.println("Motorcycle is starting...");
    }
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }
    public String getInfo() {
        return String.format("Motorcycle information:" + "\n" + "Type: " + this.type + "\n" + "Fuel: " + this.fuel + "\n" + "Color: " + this.color);
    }
}
