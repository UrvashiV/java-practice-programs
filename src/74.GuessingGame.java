import java.util.Scanner;

class GuessingGame {

    int random;
    GuessingGame(){
        random = (int) Math.ceil(Math.random() * 100);
    }

    int guess(int guessNumber){
        return guessNumber - random;
    }

     static void main() {
         Scanner input = new Scanner(System.in);
         GuessingGame game = new GuessingGame();
         System.out.println(" Welcome to the gussing game. Guess the number between 1 to 100 ");
         int guess, result;
         do{
             System.out.print("Guess the number: ");
             guess = input.nextInt();
             result = game.guess(guess);
             if(result==0){
                 System.out.println("Congrats, your guess is correct");
             } else if (result < 0 ){
                 System.out.println("Please guess higher");
             }
             else {
                 System.out.println("Please guess lower");
             }
         } while (result !=0 );

     }
}
