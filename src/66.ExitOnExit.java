import java.util.Scanner;

class ExitOnExit {
     static void main() {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to the Exit on Exit");
         while(true){
             System.out.print("Enter your command: ");
             String command = input.next();
             if (command.equalsIgnoreCase("exit")){
                 break;
             }
         }
         System.out.println("You have successfully exited.");
     }
}
