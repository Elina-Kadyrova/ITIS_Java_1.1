package entities;

public class Book {
    protected String bookName;
    protected String author;
    protected String publishingHouseName;
    protected int ageLimit;

    public Book(String bookName, String author, String publishingHouseName, int ageLimit) {
        this.bookName = bookName;
        this.author = author;
        this.publishingHouseName = publishingHouseName;
        this.ageLimit = ageLimit;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouseName() {
        return publishingHouseName;
    }

    public void setPublishingHouseName(String publishingHouseName) {
        this.publishingHouseName = publishingHouseName;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    @Override
    public String toString() {
        return "Book: " +
                "Book name:" + bookName + '\n' +
                "Author" + author + '\n' +
                "Publishing house name" + publishingHouseName + '\n' +
                "Age limit" + ageLimit;
    }
}
