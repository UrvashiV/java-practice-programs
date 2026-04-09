 class Book {
         static int totalNoOfBooks;

         String author;
         String title;
         String isbn;
         boolean isBorrowed;

         static{
             totalNoOfBooks = 0;
         }
         {
             totalNoOfBooks++;
         }

     Book(String isbn,String title, String author){
             this.isbn= isbn;
             this.author= author;
             this.title = title;
     }

     Book(String isbn){
             this(isbn,"Unknown","Unknown");
     }

     static int getTotalNumberOfBooks(){
             return totalNoOfBooks;
     }

     void borrowBook(){
             if(isBorrowed){
                 System.out.println("Book is already borrowed");
             }
             else{
                 this.isBorrowed= true;
                 System.out.println("Enjoy "+this.title+".......");
             }
     }

     void returnBook(){
             if(isBorrowed){
                 this.isBorrowed = false;
                 System.out.println("Hope you enjoyed the Book");
             }
             else{
                 System.out.println("this book is already in the library");
             }
     }

     static void main() {
         Book designOfThings = new Book("1","Design","Author");
         Book myBook = new Book("1");
         System.out.println(Book.getTotalNumberOfBooks());
         designOfThings.borrowBook();
         myBook.borrowBook();
         designOfThings.borrowBook();
         designOfThings.returnBook();
         designOfThings.returnBook();
     }

}
