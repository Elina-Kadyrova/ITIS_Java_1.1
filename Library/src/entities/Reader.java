package entities;

public class Reader extends Human{
    protected boolean status; // false - usual reader, true - reader in Black list
    protected Order order;

    public Reader(String name, String surname, int age, boolean gender, String address, boolean status) {
        super(name, surname, age, gender, address);
        this.status = status;
    }

    public Reader(String name, String surname, int age, boolean gender,
                  String address, boolean status, Order order) {
        super(name, surname, age, gender, address);
        this.status = status;
        this.order = order;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public boolean checkReturn(Order order){
        boolean result = true;
        if (!LibrarySystem.checkBookAvailability(order.book)){
            result = false;
        }
        return result;
    }
}
