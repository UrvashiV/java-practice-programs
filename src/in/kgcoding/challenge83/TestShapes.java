package in.kgcoding.challenge83;

public class TestShapes {

    static void main() {
        Circle circle  = new Circle(5);
        Square square = new Square(10);

        System.out.printf("Area of circle %5.2f",circle.calculateArea());
        System.out.printf("\nArea of Square %5.2f",square.calculateArea());

    }

}
