class Car {
    private double gasolineCapacity;
    private double speed;
    private boolean cruiseControl;
    private double targetSpeed;



    public Car() {
        gasolineCapacity = 30;
        speed = 0;
        cruiseControl = false;
        targetSpeed = 0;
    }
    public Car(double gasolineCapacity, double speed, boolean cruiseControl, double targetSpeed) {
        this.gasolineCapacity = gasolineCapacity;
        this.speed = speed;
        this.cruiseControl = cruiseControl;
        this.targetSpeed = targetSpeed;
    }
    public double getGasolineCapacity() {
        return gasolineCapacity;
    }

    public double getSpeed() {
        if (cruiseControl) {
            speed = targetSpeed;
        }
        return speed;
    }

    public double getTargetSpeed() {

        return targetSpeed;
    }

    public void setTargetSpeed(double i) {
        if (i <= 120 && i >= 30) {
            targetSpeed = i;
            System.out.print(i);
        } else {
            turnCruiseOff();
        }
        if (cruiseControl) {
            speed = targetSpeed;
        }
    }

    public void turnCruiseOn() {
        cruiseControl = true;
    }
    public void turnCruiseOff() {
        cruiseControl = false;
    }
}