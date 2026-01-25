public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car();
        myCar.setTargetSpeed(50);
        System.out.println("Target speed: " + myCar.getTargetSpeed() + "km/h");
        for (int j = 0; j < 6; j++) {
            myCar.turnCruiseOn();
            System.out.println(myCar.getSpeed());
            System.out.println(": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            //myCar.decelerate(15);
            System.out.println(": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}