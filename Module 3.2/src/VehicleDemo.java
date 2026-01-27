public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Car", "Petrol", "White");
        Motorcycle myMotorcycle = new Motorcycle("Motorcycle", "Gasoline", "Red");
        Bus myBus = new Bus("Bus", "Diesel", 40);
        myCar.start();
        myCar.stop();
        System.out.println(myCar.getInfo());
        System.out.println();

        myMotorcycle.start();
        myMotorcycle.stop();
        System.out.println(myMotorcycle.getInfo());
        System.out.println();

        myBus.start();
        myBus.stop();
        System.out.println(myBus.getInfo());
        System.out.println();







    }
}
