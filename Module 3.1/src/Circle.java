public class Circle extends Shape {
    public double radius;

    public Circle() {
        area = 0;
        radius = 0;
    }
    public Circle(double radius, double area) {
        super(area);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Area of Circle with radius " + this.radius + ": ";
    }
}
