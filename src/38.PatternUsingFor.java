import java.util.Scanner;
class PatternUsingFor {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the pattern logic");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        System.out.println("Here is your first pattern....");
        printFirstPattern(num);
        System.out.println("\nHere is your second pattern....");
        printSecondPattern(num);
        System.out.println("\nHere is your third pattern....");
        printThirdPattern(num);
    }
    public static void printFirstPattern( int max){
        int rows =0;
        while(rows< max){
            System.out.print("*");
             int i =0;
             while(i<rows){
                 System.out.print(" *");
                 i++;
             }
            System.out.println();
             rows++;
        }
    }

    public static void printSecondPattern(int max){
        int rows = max;
        while(rows>0){
            int i =0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }

    }
    public static void printThirdPattern(int num){
        int rows = num;

        while(rows > 0){

            // print spaces
            int j = 0;
            while(j < rows - 1){
                System.out.print("  ");   // fixed: two spaces
                j++;
            }

            // print stars
            int i = 0;
            while(i <= (num - rows)){
                System.out.print("* ");
                i++;
            }

            System.out.println();
            rows--;
        }
    }
}
