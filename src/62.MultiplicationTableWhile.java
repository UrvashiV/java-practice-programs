import java.util.Scanner;
class MultiplicationTableWhile {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        print(num);

    }
    public static void print(int num){
        int i = 1;
        while(i<=10){
            System.out.println(num +" * "+ i +" i "+ " = "+ num*i);
            i++;
        }
    }
}
