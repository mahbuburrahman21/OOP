package Challenge51;

public class Book {
    static int totalBooks;
    String title,author;
    int isbn;
    boolean isBorrowed;


    static {
        totalBooks = 0;
    }
    {// object init. Whenever an object will be created then this count will increase
        totalBooks++;
    }

    Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Book(int isbn){
        this("Unknown", "Unknown", isbn);
    }

    static int getTotalBooks(){
        return totalBooks;
    }



    void borrowBook(){
        if (isBorrowed){
            System.out.println(this.title +" Book is already borrowed.");
        }
        else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book: "+this.title);
        }
    }

    void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the book. ");
        }
        else {
            System.out.println(this.title +" is already in the Library.");
        }

    }




}
