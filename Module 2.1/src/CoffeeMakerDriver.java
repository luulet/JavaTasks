public class CoffeeMakerDriver {
    public static void main(String[] args) {

        CoffeeMaker tester = new CoffeeMaker();

        if (!tester.isOn()) {
            tester.pressOnOff();
            System.out.println("Coffee maker is on");
            tester.pressMode();
            System.out.println("Coffee type is " + tester.getType());
            tester.setAmount(50);
            System.out.println("Coffee amount is " + tester.getAmount() + " ml");
            tester.pressOnOff();
        }
        if (!tester.isOn()) {
            System.out.println("Coffee maker is off");
        }
    }
}
class CoffeeMaker {

    private boolean on;
    private String type;
    private int amount;

    public CoffeeMaker() {
        on = false;
        type = "normal";
        amount = 0;
    }
    public CoffeeMaker(boolean on, String type, int amount) {
        this.on = on;
        this.type = type;
        this.amount = amount;
    }
    public boolean isOn() {
        return on;
    }
    public void pressOnOff() {
        on = !on;
    }
    public String getType() {
        return type;
        }
    public void pressMode() {
        if (on) {
            if (type.equals("normal")) {
                type = "espresso";
            } else {
                type = "normal";
            }
        }

    }
    public void setAmount(int i) {
        if (on && i >= 10 && i <= 80) {
            amount = i;
        }

    }
    public int getAmount() {
        return amount;
    }
}