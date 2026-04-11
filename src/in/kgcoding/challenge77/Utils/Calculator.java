package in.kgcoding.challenge77.Utils;

import in.kgcoding.challenge77.Geometry.Circle;
import in.kgcoding.challenge77.Geometry.Rectangle;

public class Calculator {

    static void main() {
        Circle circle = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(circle.radius,2);
        double rectArea = rect.length * rect.width;

        System.out.printf("Area of circle is: %f, Area of rectangle is: %f", cirArea,rectArea);
    }

}
