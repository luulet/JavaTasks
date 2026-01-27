public class Car implements Vehicle {

    public String type;
    public String fuel;
    public String color;

    public Car(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }
    public void start() {
        System.out.println("Car is starting...");
    }
    public void stop() {
        System.out.println("Car is stopping...");
    }
    public String getInfo() {
        return String.format("Car information:" + "\n" + "Type: " + this.type + "\n" + "Fuel: " + this.fuel + "\n" + "Color: " + this.color);
    }
}
