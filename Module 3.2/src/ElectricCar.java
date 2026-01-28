public class ElectricCar extends AbstractVehicle {

    private int batteryCapacity; // kWh

    public ElectricCar(int batteryCapacity) {
        super("Electric Car", "Electric");
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Car Information:\n" + "Type: " + this.type + "\n" + "Fuel: " + this.fuel + "\n" + "Battery Capacity: " + batteryCapacity + " kWh";
    }
}