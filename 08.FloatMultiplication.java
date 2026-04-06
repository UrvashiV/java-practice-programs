import java.util.Scanner;
class FloatMultiplication {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Float Multiplication");
        System.out.print("Please enter first decimal number: ");
        float num1 = input.nextFloat();
        System.out.print("Please enter your second number: ");
        float num2 = input.nextFloat();
        double mul = num1* num2;
        System.out.println("\n Result is : "+ mul);
    }
}
