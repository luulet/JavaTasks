public class Rectangle extends Shape {
    public double rectangleWidth;
    public double rectangleHeight;
    public Rectangle() {
        area = 0;
        rectangleWidth = 0;
        rectangleHeight = 0;
    }
    public Rectangle(double rectangleWidth, double rectangleHeight, double area) {
        super(area);
        this.rectangleWidth = rectangleWidth;
        this.rectangleHeight = rectangleHeight;
    }

    public double calculateArea() {
        return rectangleWidth * rectangleHeight;
    }

    @Override
    public String toString() {
        return "Area of Rectangle with width " + this.rectangleWidth + " and height " + this.rectangleHeight + ": ";
    }
}
