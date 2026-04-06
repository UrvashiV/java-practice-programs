import java.util.Scanner;
class SimpleInterest {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator");
        System.out.print("Please enter your principle amount Rs: ");
        int principle = input.nextInt();
        System.out.print("Tell me your rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Tell me for how many years are you borrowed: ");
        float years = input.nextFloat();

        float interest = (principle * rate * years)/100;
        System.out.println("Your simple interest is :" + interest);





    }
}
