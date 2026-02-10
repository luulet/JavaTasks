//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();

        clock.addTime(10);

        System.out.printf("%f\n", clock.getTime());
    }
}