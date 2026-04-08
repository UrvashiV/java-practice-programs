import java.util.Scanner;
class Palindrome {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome number logic");
        System.out.print("Please enter your number:");
        int num = input.nextInt();
        boolean result = isPalindrome(num);
        if (result) System.out.println("Your number is Palindrome");
        else System.out.println("Your number is not Palindrome");
    }
     public static boolean isPalindrome(int num){
        int reverse = num;
        int newNum =0;
        while(num>0){
            int digits = num % 10;
            newNum= newNum * 10 + digits;
            num /= 10;
        }
        return newNum == reverse;
     }

}
