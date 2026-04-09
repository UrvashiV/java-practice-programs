import java.util.Scanner;

class calculatorSwitch {
    static void main() {
        System.out.println("Welcome to Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        int num2 = input.nextInt();
        System.out.print("Please enter your operation you want to perform: ");
        String op = input.next();

        int result = switch(op){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            case "%" -> num1%num2;
            default -> -1;
        };

        System.out.println("Your answer is "+ result);

    }
}
