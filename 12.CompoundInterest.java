import java.util.Scanner;
class CompoundInterest {
    static void main(){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest Calculator");
        System.out.print("Please enter your principle amount Rs: ");
        int principle = input.nextInt();
        System.out.print("Tell me your rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Tell me for how many years are you borrowed: ");
        float years = input.nextFloat();

        double compound = principle * Math.pow((1+ rate )/100,years);
        System.out.println("Your compound interest is :" + compound);
    }
}
