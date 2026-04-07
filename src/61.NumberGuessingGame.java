import java.util.Scanner;
class NumberGuessingGame {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number guessing game");
        int guess, num= 5;
        do{
            System.out.println("Please guess the number between 0 10 9: ");
            guess = input.nextInt();
        } while(num != guess);
        System.out.println("You have successfully guessed the number");
    }
}
