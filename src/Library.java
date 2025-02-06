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
            System.out.println("Title: " + book.getTitle());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Author: " + book.getAuthorName());
            System.out.println("Biography: " + book.getAuthorBio());
            System.out.println("------------------------");
        }
    }
}
