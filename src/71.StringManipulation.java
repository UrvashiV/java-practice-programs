
 class StringManipulation {

     static void main() {
         String firstName = "Rohan";
         String lastName = "Chopra";

         String fullName = firstName + " " + lastName;
         String fullName1= firstName.concat(" ").concat(lastName);
         System.out.println(fullName.toLowerCase());
         System.out.println(fullName1.toUpperCase());

     }
}
