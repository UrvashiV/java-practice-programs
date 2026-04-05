import java.util.Scanner;
class TriangleArea {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Area Calculator");
        System.out.print("Please enter your base in cms: ");
        double base = input.nextDouble();
        System.out.print("Now, enter your perpendicular height in cms: ");
        double height = input.nextDouble();

        double area = 0.5 * base* height;
        System.out.println("the area of your triangle is : " + area + " cms");
    }
}
