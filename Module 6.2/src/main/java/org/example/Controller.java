package org.example;

public class Controller {
    private Converter converter = new Converter();

    public void toggleMode() {
        converter.toggleMode();
    }

    public boolean getMode() {
        return converter.getMode();
    }

    public double convert(double money) {
        return converter.convert(money);
    }
}
