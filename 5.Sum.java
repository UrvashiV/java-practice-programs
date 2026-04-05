import java.util.Scanner;
class Sum {
    static void main(){
        System.out.println("Please enter the first number: ");
        Scanner input = new Scanner(System.in);
        int num1= input.nextInt();
        System.out.println("Please enter your second number: ");
        int num2= input.nextInt();

        int sum = num1+num2;
        System.out.println("Our sum is :" + sum);
    }

}
