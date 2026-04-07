import java.util.Scanner;
class FactorialRecursion {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the factorial calculator");
        System.out.print("Please enter your number: ");
        int num= input.nextInt();
        long fact= factorialIterative(num);
        System.out.println("Your factorial is "+ fact);
        long fact1= factorialRecursive(num);
        System.out.println("Your factorial is "+ fact1);

    }
    public static long factorialRecursive(int num){
        if (num==1) return 1;
        return num * factorialRecursive(num-1);
    }

    public static long factorialIterative(int num){
        long result =1;
        for (int i = 1; i<= num; i++){
            result *= i;
        }
        return result;
    }
}