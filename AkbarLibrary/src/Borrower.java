import java.util.ArrayList;

public class Borrower {
    private String name;

    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public Borrower(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        borrowedBooks.add(book);
    }

    public String getName() {
        return this.name;
    }

    public void removeBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void displayBorrowedBooks() {
        System.out.println(this.name + "'s borrowed books:");
        for (Book borrowedBook : borrowedBooks) {
            System.out.println("Title: " + borrowedBook.getTitle());
            System.out.println("ISBN: " + borrowedBook.getISBN());
            System.out.println("Author: " + borrowedBook.getAuthorName());
            System.out.println("Biography: " + borrowedBook.getAuthorBio());
            System.out.println("------------------------");
        }
    }
}
