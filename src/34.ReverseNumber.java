import java.util.Scanner;
class ReverseNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse number logic");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int result = reverse(num);
        System.out.println("Your result is : "+ result);
    }

    public static int reverse(int num){
        int newnum =0;
        while(num>0){
            int digit = num % 10;
            newnum = (newnum *10) +digit;
            num = num /10;
        }
        return newnum;
    }
}
