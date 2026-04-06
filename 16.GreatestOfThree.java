import java.util.Scanner;
class GreatestOfThree {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of three");
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter your third number: ");
        int num3 = input.nextInt();

        if(num1 > num2 && num1>num3){
            System.out.println("This is your greatest number: "+ num1);
        } else if(num2> num3 && num2>num1){
            System.out.println("This is your greatest number: "+ num2 );
        }else{
            System.out.println("This is your greatest number: "+ num3);
        }


    }
}
