class  Library{
    public String[] books;
    public int noOfBooks;

    public Library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println("\""+book+"\""+" has been added!");

    }

    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String book:this.books){
            if(book == null){
                continue;
            }
            System.out.println("-"+book);
        }
    }

    void issueBook(String book){
        for (int i = 0; i<this.books.length;i++) {
        if(this.books[i].equals(book)){
            System.out.println("This book has been issued! ");
            this.books[i]= null;
            return;
        }
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }

}

public class CWH_51_LIBRARY {
    public static void main(String[] args) {
        /*
        -You have to implement a library using Java Class Library
        - Methods: addBook, issueBook, returnBook, showAvailableBooks
        - Properties: Array to store the available books,
        array to store the issued books
         */
        Library centralL = new Library();

        centralL.addBook("The Forty rules of love");
        centralL.addBook("Think and grow rich");
        centralL.addBook("Rich dad poor dad");
        centralL.addBook("Data structure and algorithm");
        centralL.addBook("Signals and systems");

        System.out.println();

        centralL.showAvailableBooks();
        centralL.issueBook("Data structure and algorithm");

        System.out.println();

        centralL.showAvailableBooks();
        centralL.returnBook("Data structure and algorithm");




    }
}
