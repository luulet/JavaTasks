public class Bus extends Car {
    public int passangerQuantity;
    public int passangerCapacity;

    public Bus() {
        passangerQuantity = 0;
        passangerCapacity = 54;
        gasolineCapacity = 80;
        speed = 80;
        cruiseControl = false;
        targetSpeed = 0;
        acceleration = 3;
        gasolineConsumption = 5;
        gasolineLevel = 80;


    }
    public Bus(int passangerQuantity, int passangerCapacity, double gasolineCapacity, double speed, boolean cruiseControl, double targetSpeed, int acceleration, int gasolineConsumption, int gasolineLevel) {
        super(gasolineCapacity, speed, cruiseControl, targetSpeed, acceleration, gasolineConsumption, gasolineLevel);
        this.passangerQuantity = passangerQuantity;
        this.passangerCapacity = passangerCapacity;
    }

    public int getPassangerQuantity() {
        return passangerQuantity;
    }

    public void passangerEnter(int i) {
        if (i > 0 && passangerQuantity + i <= passangerCapacity) {
            passangerQuantity = passangerQuantity + i;
            System.out.println(i + " passengers entered the bus.");
        }
    }
    public void passangerExit(int i) {
        if (i > 0 && passangerQuantity - i >= 0) {
            passangerQuantity = passangerQuantity - i;
            System.out.println(i + " passengers left the bus.");
        }
    }


}
