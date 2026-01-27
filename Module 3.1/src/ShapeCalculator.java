import java.util.ArrayList;

public class ShapeCalculator {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(5, 0));
        shapes.add(new Rectangle(4, 6, 0));
        shapes.add(new Triangle(3, 8, 0));

        System.out.println();
        System.out.println("Shape Calculator");
        System.out.println();


        for (int i = 0; i < shapes.size(); i++) {
            System.out.print(shapes.get(i));
            System.out.println(shapes.get(i).calculateArea());

        }

    }
}
