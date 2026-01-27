public class Rectangle extends Shape {
    public double rectangleWidth;
    public double rectangleHeight;
    public String color;
    public Rectangle() {
        area = 0;
        rectangleWidth = 0;
        rectangleHeight = 0;
        color = null;
    }
    public Rectangle(double rectangleWidth, double rectangleHeight, double area, String color) {
        super(area);
        this.rectangleWidth = rectangleWidth;
        this.rectangleHeight = rectangleHeight;
        this.color = color;
    }

    public double calculateArea() {
        return rectangleWidth * rectangleHeight;
    }

    @Override
    public String toString() {
        return "Area of " + this.color + " Rectangle with width " + this.rectangleWidth + " and height " + this.rectangleHeight + ": ";
    }
}
