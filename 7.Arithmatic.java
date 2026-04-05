import java.util.Scanner;
class Arithmatic {
    static void main(){
        System.out.println("Welcome to Arithmetic Calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int add = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        int mod = num1%num2;

        System.out.println("Addition of the numbers are: " + add);
        System.out.println("Subtraction of the numbers are: " + sub);
        System.out.println("Multiplication of the numbers are: " + mul);
        System.out.println("Division of the numbers are: " + div);
        System.out.println("Modulus of the numbers are: " + mod);
    }
}
