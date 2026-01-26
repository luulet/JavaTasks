class Car {
    private double gasolineCapacity;
    private double speed;
    public boolean cruiseControl;
    private double targetSpeed;

    public Car() {
        gasolineCapacity = 30;
        speed = 60;
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

    public void updateSpeed() {
        if (cruiseControl) {
            if (speed < targetSpeed) {
                speed += 5;
            } else if (speed > targetSpeed) {
                speed -= 5;
            }
        }
    }

    public double getSpeed() {
        return speed;
    }

    public double getTargetSpeed() {

        return targetSpeed;
    }

    public void setTargetSpeed(double i) {
        if (i <= 120 && i >= 30) {
            targetSpeed = i;
        } else {
            turnCruiseOff();
        }
    }

    public void turnCruiseOn() {cruiseControl = true;
        System.out.println("Cruise Control has been turned on.");}
    public void turnCruiseOff() {
        cruiseControl = false;
        System.out.println("Cruise Control has been turned off.");
    }}