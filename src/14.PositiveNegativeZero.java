import java.util.Scanner;
class PositiveNegativeZero {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Number Checker");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        if(num==0){
            System.out.println("Your number is Zero");
        }else if(num > 0){
            System.out.println("Your number is Positive");
        }else{
            System.out.println("Your number is Negative");
        }

    }
}
