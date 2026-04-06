 import java.util.Scanner;
class LeapYear {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New Year Calculator");
        System.out.print("Please enter your year you want to check: ");
        int year = input.nextInt();
        if (year % 400 ==0){
            System.out.println("Your year is a leap year.");
        }
        else if(year % 4==0 && year %100!=0){
            System.out.println("Your year is a leap Year");;
        }
        else{
            System.out.println("This year is not a leap year");
        }
    }
}
