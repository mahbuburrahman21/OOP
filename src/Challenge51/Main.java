package Challenge51;

public class Main {
    static void main(String[] args) {

        Book book1 = new Book("Alchemist", "Paulo", 1);
        Book book2 = new Book("Himu", "Humayun", 2);
        Book book3 = new Book("After", "Mahbub", 3);
        Book book4 = new Book("Life", "Mahbub", 4);
        Book book5 = new Book("Memsaheb", "Nimai", 1);

        System.out.println("Total Books in the library: "+Book.getTotalBooks());

        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book2.borrowBook();
        book3.borrowBook();
        book3.returnBook();
        book3.returnBook();

        System.out.println("Total Books in the library: "+Book.getTotalBooks());
    }
}
