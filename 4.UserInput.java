import java.util.Scanner;
class UserInput {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome to this course " + name);
    }

}
