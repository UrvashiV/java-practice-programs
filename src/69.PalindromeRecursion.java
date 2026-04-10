import java.util.Scanner;

class PalindromeRecursion {
     static void main(String[] arg) {
         System.out.println("Welcome to Palindrome checker");
         Scanner input = new Scanner(System.in);
         System.out.print("Please enter your string: ");
         String str = input.next();
         System.out.println("Your string is " + (isPalindrome(str) ? "Palindrome"
                                                                   : "not Palindrome "));
     }

     public static boolean isPalindrome(String str){
         if(str.length() <= 1){
             return true;
         }
         int lastPos = str.length()-1;
         if(str.charAt(0) !=str.charAt(lastPos)){
             return false;
         }
         String newStr = str.substring(1,lastPos);
         return isPalindrome(newStr);
     }
}
