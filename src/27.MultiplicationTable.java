import java.util.Scanner;
class MultiplicationTable {
    static void main(){
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num =input.nextInt();
        print(num);
    }
    public static void print(int num){
        for(int i =1; i <=10; i++){
            System.out.println(num + " * " + i + " = "+ num*i);
        }
    }
}
