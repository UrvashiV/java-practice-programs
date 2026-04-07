import java.util.Scanner;
class LCM {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM calculator");
        System.out.print("please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Enter your second number: ");
        int second=input.nextInt();
        int result = lcm(first,second);
        System.out.println("Your result is: " + result);
    }

    public static int lcm(int first, int second){
        for(int i =1 ; i<=second; i++){
            int factor = first * i;
            if(factor % second==0){
                return factor;
            }
        }
        return 0;
    }

}