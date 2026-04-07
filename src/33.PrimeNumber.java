import java.util.Scanner;
class PrimeNumber {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Wlcome to prime number checker");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean result = isPrime(num);
        if(result){
            System.out.println("Your number is Prime");
        } else {
            System.out.println("Your number is not prime");
        }

    }
    public static boolean isPrime(int num){
        for (int i =2 ;i<num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
