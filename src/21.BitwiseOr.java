import java.util.Scanner;
class BitwiseOr {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Or operator");
        System.out.print("Please enter your number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();

        int result = num1 | num2;
        System.out.println("Result is "+ result);


    }
}
