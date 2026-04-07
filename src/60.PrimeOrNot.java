import java.util.Scanner;
class PrimeOrNot {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("Your number is "+ (isPrime? "Prime" : "not Prime"));
    }

    public static boolean isPrime(int num){
        for (int i =2; i<num; i++){
            if(num % 2==0){
                return false;
            }
        }
        return true;
    }
}
