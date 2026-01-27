public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car();
        myCar.turnCruiseOn();
        myCar.setTargetSpeed(90);

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


        Bus myBus;

        myBus = new Bus();
        myBus.passangerEnter(5);
        System.out.println(myBus.getPassangerQuantity());
        myBus.passangerExit(4);
        System.out.println(myBus.getPassangerQuantity());

    }
}