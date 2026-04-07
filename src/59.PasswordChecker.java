import java.util.Scanner;
class PasswordChecker {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to set your password: ");
        String password;
        do{
            System.out.print("Please enter your password: ");
            password =input.next();
        } while(!isValidPassword(password));
            System.out.println("Thanks for entering a valid password");


    }
    public static boolean isValidPassword(String pass){
        return pass.length()>6;
    }
}
