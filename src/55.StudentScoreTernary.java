import java.util.Scanner;

class StudentScoreTernary {
    static void main() {
        System.out.println("Welcome to Student Score");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your marks: ");
        int marks = input.nextInt();
        String category = marks >80 ?" High" :(marks >50 ? "Moderate" : "Low");
        System.out.println("your category is "+ category);
    }
}
