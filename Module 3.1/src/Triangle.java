public class Triangle extends Shape {
    public double triangleBase;
    public double triangleHeight;
    public String color;
    public Triangle() {
        area = 0;
        triangleBase = 0;
        triangleHeight = 0;
        color = null;
    }
    public Triangle(double trianleBase, double triangleHeight, double area, String color) {
        super(area);
        this.triangleBase = trianleBase;
        this.triangleHeight = triangleHeight;
        this.color = color;
    }

    public double calculateArea() {
        return (triangleBase * triangleHeight) / 2;
    }

    @Override
    public String toString() {
        return "Area of " + this.color + " Triangle with base " + this.triangleBase + " and height " + this.triangleHeight + ": ";
    }
}
