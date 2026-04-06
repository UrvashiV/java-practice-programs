import java.util.Scanner;
class OddEvan {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Evan calculator");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        if (num % 2 ==0){
            System.out.println("Your number is Evan");
        }else{
            System.out.println("Your number is Odd");
        }

    }
}
