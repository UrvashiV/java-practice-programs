import java.util.Scanner;

class OddEvenTernary {
    static void main() {
        System.out.println("Welcome to Odd or Even");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        String result =num % 2==0 ? "Even":"Odd";
        System.out.println("Your number is "+ result);

    }
}
