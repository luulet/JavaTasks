public class Motorcycle implements Vehicle {
    public String type;
    public String fuel;
    public String color;

    public Motorcycle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
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
