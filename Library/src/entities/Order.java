package entities;

public class Order {
    protected Book book;
    protected Reader reader;
    protected int terms;

    public Order(Book book, int terms, Reader reader) {
        this.book = book;
        this.terms = terms;
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public int getTerms() {
        return terms;
    }

    public Reader getReader() {
        return reader;
    }
}
