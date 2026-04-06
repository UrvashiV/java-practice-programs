import java.util.Scanner;
class BitwiseCompliment {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment Operator");
        System.out.print("Please enter your number: ");
        int num= input.nextInt();
        int result = ~num;
        System.out.println("your result is "+ result);

    }
}
