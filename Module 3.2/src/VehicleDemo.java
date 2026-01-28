public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Petrol", "White");
        Vehicle myMotorcycle = new Motorcycle("Gasoline", "Red");
        Vehicle myBus = new Bus("Diesel", 40);

        //task 1 and 2

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

        //task 3
        System.out.println();
        System.out.println();
        System.out.println("Task 3");
        Vehicle eCar = new ElectricCar(75);

        myCar.start();
        ((ElectricVehicle) myCar).charge();   // Not possible
        myCar.stop();
        System.out.println(myCar.getInfo());
        System.out.println();

        eCar.start();
        ((ElectricVehicle) eCar).charge();   // Charging
        eCar.stop();
        System.out.println(eCar.getInfo());





    }
}
