public class Triangle extends Shape {
    public double triangleBase;
    public double triangleHeight;
    public Triangle() {
        area = 0;
        triangleBase = 0;
        triangleHeight = 0;
    }
    public Triangle(double trianleBase, double triangleHeight, double area) {
        super(area);
        this.triangleBase = trianleBase;
        this.triangleHeight = triangleHeight;
    }

    public double calculateArea() {
        return (triangleBase * triangleHeight) / 2;
    }

    @Override
    public String toString() {
        return "Area of Triangle with base " + this.triangleBase + " and height " + this.triangleHeight + ": ";
    }
}
