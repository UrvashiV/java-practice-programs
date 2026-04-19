package in.kgcoding.challeneg87;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter your second number: ");
        int num2 = input.nextInt();

        try {
            int result = num1 / num2;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.println("Divide by zero occurred.");
            }
            else{
                throw exception;
            }
        }

    }

}
