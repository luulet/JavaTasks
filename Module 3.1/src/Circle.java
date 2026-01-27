public class Circle extends Shape {
    public double radius;
    public String color;

    public Circle() {
        area = 0;
        radius = 0;
        color = null;
    }
    public Circle(double radius, double area, String color) {
        super(area);
        this.radius = radius;
        this.color = color;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Area of " + this.color + " Circle with radius " + this.radius + ": ";
    }
}
