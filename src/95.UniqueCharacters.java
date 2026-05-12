import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacters {
     static void main() {
         Set<Character> unique = new HashSet<>();
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter your string: ");
         String userStr = input.next();
         for(char ch : userStr.toCharArray()){
             unique.add(ch);
         }

         System.out.printf("Unique characters in your string %d",unique.size());
     }

}
