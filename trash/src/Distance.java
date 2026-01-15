

public class Distance {
    private static double sqrt(double a) {
        double x = a/2;
        double eps = 4*Math.ulp(a);

        while (Math.abs(x*x - a) >= eps) {
            x = (a/x + x)/2;
        }
        return (x);
    }
    private static double distance (int x1, int y1, int z1, int x2, int x2, int z2) {
        return sqrt(Math.pow())
    }
}
