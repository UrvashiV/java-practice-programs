import java.util.Scanner;

class Circle {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    double getCircumference(){
        return 2 * radius * Math.PI;
    }

    double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

     @Override
     public String toString() {
         return "Circle Props: Radius in mm: "+radius
                 +", Circumference in mm: "+getCircumference()
                 +", Area in mm:"+getArea();
     }

     static void main() {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to the world of circle");
         System.out.print("Please enter the radius: ");
         double radius = input.nextDouble();
         Circle circle = new Circle(radius);
         System.out.println(circle);
     }
}
