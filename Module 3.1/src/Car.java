class Car {
    public double gasolineCapacity;
    public double speed;
    public boolean cruiseControl;
    public double targetSpeed;
    public int acceleration;
    public int gasolineConsumption;
    public int gasolineLevel;

    public Car() {
        gasolineCapacity = 30;
        speed = 60;
        cruiseControl = false;
        targetSpeed = 0;
        acceleration = 5;
        gasolineConsumption = 2;
        gasolineLevel = 30;


    }
    public Car(double gasolineCapacity, double speed, boolean cruiseControl, double targetSpeed, int acceleration, int gasolineConsumption, int gasolineLevel) {
        this.gasolineCapacity = gasolineCapacity;
        this.speed = speed;
        this.cruiseControl = cruiseControl;
        this.targetSpeed = targetSpeed;
        this.acceleration = acceleration;
        this.gasolineConsumption = gasolineConsumption;
        this.gasolineLevel = gasolineLevel;
    }
    public double getGasolineCapacity() {
        return gasolineCapacity;
    }

    public void updateSpeed() {
        if (cruiseControl) {
            if (speed < targetSpeed) {
                speed += acceleration;
            } else if (speed > targetSpeed) {
                speed -= acceleration;
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