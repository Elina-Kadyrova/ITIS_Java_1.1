package entities;

import java.util.ArrayList;

public class LibrarySystem {
    public static ArrayList<Book> catalog;

    public LibrarySystem(ArrayList<Book> catalog) {
        this.catalog = catalog;
    }

    public ArrayList<Book> getCatalog() {
        return catalog;
    }

    public static void addBook(Book book){
        catalog.add(book);
    }

    public void deleteBook(Book book){
        catalog.remove(book);
    }

    public static boolean checkBookAvailability(Book book){
        boolean result = false;
        if (catalog.contains(book)) {
            result = true;
        }
        return result;
    }

}
