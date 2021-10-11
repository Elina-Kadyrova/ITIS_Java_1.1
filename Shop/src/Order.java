import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Product> personalOrder;

    public Order(Customer customer, ArrayList<Product> personalOrder) {
        this.customer = customer;
        this.personalOrder = personalOrder;
    }

    public void getOrder() {
        System.out.println("Покупатель: " + customer.getName());
        System.out.println("Список купленных товаров: ");
        for (Product product : personalOrder) {
            System.out.println(product.getName() +
                    "(" + product.getProducer() + ", "
                    + product.getPrice() + ")");
        }
    }

    public Customer getCustomer() {
        return customer;
    }
}
