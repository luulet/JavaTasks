public class CarDriver {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.turnCruiseOn();
        myCar.setTargetSpeed(90);
        System.out.println("Normal car: ");
        System.out.println("Current speed is " + myCar.getSpeed() + " km/h");
        System.out.println("Target speed: " + myCar.getTargetSpeed() + "km/h");


        if (myCar.cruiseControl) {
            System.out.println("Cruise Control is on.");
        } else {
            System.out.println("Cruise Control if off.");
        }

        for (int j = 0; j < 6; j++) {

            myCar.updateSpeed();
            System.out.println("Current speed is " + myCar.getSpeed() + " km/h");
            if (myCar.getSpeed() == myCar.getTargetSpeed()) {
                System.out.println("Car is at target speed.");
            }
        }




        SportsCar mySportCar = new SportsCar();
        mySportCar.turnCruiseOn();
        mySportCar.setTargetSpeed(90);
        System.out.println();
        System.out.println("Sports car:");
        System.out.println("Current speed is " + mySportCar.getSpeed() + " km/h");
        System.out.println("Target speed: " + mySportCar.getTargetSpeed() + "km/h");


        if (mySportCar.cruiseControl) {
            System.out.println("Cruise Control is on.");
        } else {
            System.out.println("Cruise Control if off.");
        }

        for (int j = 0; j < 6; j++) {

            mySportCar.updateSpeed();
            System.out.println("Current speed is " + mySportCar.getSpeed() + " km/h");
            if (mySportCar.getSpeed() == mySportCar.getTargetSpeed()) {
                System.out.println("Car is at target speed.");
            }
        }
        //task 2
        System.out.println();
        Bus myBus;

        myBus = new Bus();
        myBus.passangerEnter(5);
        System.out.println("Passenger quantitity: " + myBus.getPassangerQuantity());
        myBus.passangerExit(4);
        System.out.println("Passenger quantitity: " + myBus.getPassangerQuantity());

    }
}