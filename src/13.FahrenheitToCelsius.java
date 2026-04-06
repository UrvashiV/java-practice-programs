import java.util.Scanner;
class FahrenheitToCelsius {
    static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Temperature Convert");
        System.out.print("Enter your Temp in F: ");
        float fah = input.nextFloat();
        float cel = (fah-32) * 5/9;
        System.out.println("Your temperature is: "+ cel +"C");

    }
}
