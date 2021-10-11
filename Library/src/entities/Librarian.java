package entities;

import exceptions.BlackListReaderException;

public class Librarian extends Worker{

    public Librarian(String name, String surname, int age, boolean gender,
                     String address, int seniority, double salary) {
        super(name, surname, age, gender, address, seniority, salary);
    }

    public void giveBookForSubscription(Reader reader, Order order) throws BlackListReaderException {
        if (reader.status) {
            throw new BlackListReaderException ("Blacklisted reader: it is impossible to issue the order.");
        }
    }

    public Book giveBookToReadingRoom(Reader reader, Order order) throws BlackListReaderException {
        if (reader.status) {
            throw new BlackListReaderException("Blacklisted reader: it is impossible to issue the order.");
        }
        return order.book;
    }
}
