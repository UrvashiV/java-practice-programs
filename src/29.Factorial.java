import java.util.Scanner;
class Factorial {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        long result = fact(num);
        System.out.println("Factorial is: " +result);
    }
    public static long fact(int num){
        long fact = 1;
        if(num <2){
            return 1;
        }
        for(int i=2; i<=num;i++){
            fact *= i;
        }
        return fact;
    }
}
