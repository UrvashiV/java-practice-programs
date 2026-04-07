import java.util.Scanner;
class GCD {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of digits calculator");
        System.out.println("please enter yuor first number");
        int first = input.nextInt();
        System.out.println("please enter yuor second number");
        int second = input.nextInt();
        int result = gcd(first,second);
        System.out.println("Your result is: " + result);
    }

    public static int gcd(int first, int second){
        int gcd = 1;
        int least = least(first,second);
        for(int i = 2; i<=least; i++){
            if(first % i==0 && second % i ==0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if (num1>num2)
            return num2;
        else return num1;
    }
}
