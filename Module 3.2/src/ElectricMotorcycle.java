public class ElectricMotorcycle extends AbstractVehicle {

    private int batteryCapacity; // kWh

    public ElectricMotorcycle(int batteryCapacity) {
        super("Electric Motorcycle", "Electric");
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:\n" + "Type: " + this.type + "\n" + "Fuel: " + this.fuel + "\n" + "Battery Capacity: " + batteryCapacity + " kWh";
    }
}