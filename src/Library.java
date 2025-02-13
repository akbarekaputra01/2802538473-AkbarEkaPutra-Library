import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library = new ArrayList<Book>();

    public void addBook(Book book) {
        library.add(book);
        System.out.println("Book added to library: " + book.getTitle());
    }

    public void borrowBook(Borrower borrower, Book book) {
        library.remove(book);
        borrower.setBook(book);
        System.out.println(borrower.getName() + " borrowed: " + book.getTitle());
    }

    public void returnBook(Borrower borrower, Book book) {
        borrower.removeBook(book);
        library.add(book);
        System.out.println(borrower.getName() + " returned: " + book.getTitle());
    }

    public void displayLibraryBooks() {
        System.out.println("Books in library:");
        for (Book book : library) {
            book.displayBook(book);
        }
    }
}
