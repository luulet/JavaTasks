public class SportsCar extends Car {


    public SportsCar() {
        gasolineCapacity = 20;
        speed = 80;
        cruiseControl = false;
        targetSpeed = 0;
        acceleration = 8;
        gasolineConsumption = 3;
        gasolineLevel = 20;
    }
    public SportsCar(double gasolineCapacity, double speed, boolean cruiseControl, double targetSpeed, int acceleration, int gasolineConsumption, int gasolineLevel) {
        super(gasolineCapacity, speed, cruiseControl, targetSpeed, acceleration, gasolineConsumption, gasolineLevel);
    }
}
