import java.util.Scanner;
class LeftShift {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Left shift Operator");
        System.out.print("Please enter your number: ");
        int num= input.nextInt();
        int result = num << 1;
        System.out.println("your result is "+ result);

    }
}
