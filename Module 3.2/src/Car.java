public class Car extends AbstractVehicle {


    private String color;

    public Car(String fuel, String color) {
        super("Car", fuel);
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
