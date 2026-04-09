import java.util.Scanner;

class MinNumber {
     static void main() {
         System.out.println("Welcome to ternary operator");
         Scanner input = new Scanner(System.in);
         System.out.print("Please enter your first number: ");
         int num1 = input.nextInt();
         System.out.print("Enter your second number: ");
         int num2 = input.nextInt();

         MinNumber ternary = new MinNumber();
         int min= ternary.min(num1,num2);
         System.out.println("Minimum Number is: "+ min);


     }

     public int min(int num1,int num2){
         return num1<num2 ? num1:num2;
     }
}
