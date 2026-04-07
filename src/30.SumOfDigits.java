import java.util.Scanner;
class SumOfDigits {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of digits calculator");
        System.out.println("please enter yur number");
        int num = input.nextInt();
        int result = sum(num);
        System.out.println("Your result is: "+ result);
    }

    public static int sum(int num){
        int sum =0;
        while(num>0){
            sum += num % 10;
            num= num/10;
        }
        return sum;
    }
}
