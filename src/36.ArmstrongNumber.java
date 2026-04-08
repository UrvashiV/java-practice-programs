import java.util.Scanner;
class ArmstrongNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong number logic");
        System.out.print("Please enter your number:");
        int num = input.nextInt();
        boolean result = armstrong(num);
        if(result) System.out.println("Your number is Armstrong");
        else System.out.println("Your number is not Armstrong");
    }
    public static boolean armstrong(int num){
        int noOfDigits = noOfDigits(num);
        int num1 =num;
        int finalNumber=0;
        while(num>0){
            int lastDigit = num% 10;
            num /=10;
            finalNumber += power(lastDigit,noOfDigits);
        }
        return finalNumber == num1;
    }

    public static int power(int num1,int num2){
        int result = num1;
        for(int i=1; i< num2; i++){
            result *= num1;
        }
        return result;
    }
    public static int noOfDigits(int num){
        int digits =0;
        while(num>0){
            digits ++;
            num /= 10;
        }
        return digits;
    }
}
