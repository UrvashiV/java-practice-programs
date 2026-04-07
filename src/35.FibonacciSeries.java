import java.util.Scanner;
class FibonacciSeries {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        System.out.println("here is the Fibonacci Series: ");
        fab(num);
    }
    public static void fab(int num){
        int first =0, second=1;
        if(num<0) return;
        System.out.print("0 ");
        if(num == 0) return;
        while(first + second <= num){
            int third = first +second;
            System.out.print(third +" ");
            first = second;
            second= third;
        }
    }
}
