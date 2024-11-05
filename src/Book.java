public class Book {

    private String bookName;
    private Author bookAuthor;
    private int publicationYear;

    public Book(String bookName, Author bookAuthor, int publicationYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
