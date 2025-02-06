public class Book {
    private String title;
    private String ISBN;
    private Author author;

    public Book(String title, String ISBN, Author author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public String getAuthorName() {
        return this.author.getName();
    }

    public String getAuthorBio() {
        return this.author.getBiography();
    }
}