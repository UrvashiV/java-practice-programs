import java.util.Scanner;

class FibonacciRecursion {
     static void main() {
         System.out.println("Welcome to the recursion fibonacci series");
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number of element to be printed: ");
         int count = input.nextInt();
         for (int i =1; i<=count; i++){
             System.out.print(fibonacci(i) + " ");
         }
     }

     public static int fibonacci(int num){
         if(num == 1){
             return 0;
         }
         if(num==2){
             return 1;
         }
         return fibonacci(num -1) +fibonacci(num - 2);
     }
}
