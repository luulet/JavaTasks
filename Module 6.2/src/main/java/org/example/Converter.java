package org.example;

public class Converter {
    private boolean mode = false;
    public void toggleMode() {
        mode = !mode;
    }
    public boolean getMode() {
        return mode;
    }

    private double euroToDollar(double euro) {
        return euro * 1.18;
    }

    private double dollarToEuro(double dollar) {
        return dollar * 0.85;
    }

    public double convert(double money) {
        if (mode) {
            return dollarToEuro(money);
        } else {
            return euroToDollar(money);
        }
    }

}
