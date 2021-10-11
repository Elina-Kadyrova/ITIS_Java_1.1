import entities.*;
import exceptions.BlackListReaderException;
import exceptions.LackOfBookException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LackOfBookException, BlackListReaderException {
        Scanner sc = new Scanner(System.in);
        Book book = new Book("Thinking in Java", "Bruce Eckel", "PH PTR",
                12);
        ArrayList<Book> catalog = new ArrayList<Book>();
        catalog.add(book);
        LibrarySystem librarySystem = new LibrarySystem(catalog);
        Admin admin = new Admin("Lev","Lvov", 56, true, "Moscow",
                3, 18000);
        Librarian librarian = new Librarian("Olga","Petrovna", 46, false, "Moscow",
                5, 15000);
        LibrarySystem.addBook(book);
        Reader reader = new Reader("Ivan","Ivanov", 25, true, "Moscow", false);
        Order order = new Order(book, 30, reader);
        if (LibrarySystem.checkBookAvailability(book)) {
            librarian.giveBookForSubscription(reader, order);
        }
        else {
            throw new LackOfBookException ("The book can't be issued: it's not in the library");
        }
        if (!reader.checkReturn(order)){
            admin.toBlacklist(reader);
        }
    }
}
