import java.util.Scanner;
class SwapNumbers {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = input.nextInt();;
        System.out.print("Enter the second Number: ");
        int num2 = input.nextInt();
        int swap =num1;
        num1= num2;
        num2=swap;
        System.out.println("After swapping A is " + num1 + " and B is " + num2);
    }
}
