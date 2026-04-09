import java.util.Scanner;

class AbsoluteTernary {

    static void main() {
        System.out.println("Welcome to Absolute Value");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value is "+ result);
    }
}
