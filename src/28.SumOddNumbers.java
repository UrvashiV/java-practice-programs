import java.util.Scanner;
class SumOddNumbers {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int sum = oddsum(num);
        System.out.println("Your sum is: "+ sum);

    }
    public static int oddsum(int num){
        int sum1 =0;
        for(int i=1; i<=num ; i=i+2){
             sum1 = sum1 +i;
        }
        return sum1;
    }
}
