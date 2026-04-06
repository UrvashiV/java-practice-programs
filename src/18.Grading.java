
import java.util.Scanner;
class Grading {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the grading Calculator");
        System.out.print("Please enter your percentage: ");
        float marks = input.nextFloat();
        if(marks >= 90){
            System.out.println("Great, you have got A");
        }else if(marks>=75){
            System.out.println("Good, you have got B");
        }else if(marks>=60){
            System.out.println("you have got C, Work harder next time");
        }else if(marks>=30){
            System.out.println("You have got D,You seriously need to work");
        }
        else{
            System.out.println("Sorry, you have failed the test and got F");
        }


    }
}
