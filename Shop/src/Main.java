import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        ArrayList<Customer> customerArrayList = admin.createCustomersALFromFile();
        ArrayList<String> linkArrayList = admin.assignLink();
        ArrayList<Order> orderArrayList = new ArrayList<>();
        admin.createOrdersFromFile(orderArrayList, linkArrayList);

        while (true) {
            int sc = scanner.nextInt();
            switch (sc) {
                case 1:
                    //вывод списка покупателей
                    for (Customer customer : customerArrayList) {
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    //новый заказ с консоли
                    admin.createNewOrder(orderArrayList, customerArrayList);
                    System.out.println("Заказ сделан");
                    break;
                case 3:
                    //вывод всех заказов
                    for (Order order : orderArrayList) {
                        order.getOrder();
                    }
                    break;
                case 4:
                    //вывод конкретного заказа
                    System.out.println("Введите имя покупателя:");
                    String name = scanner.next();
                    admin.checkOrder(name, orderArrayList);
                    break;
                default:
                    System.out.print("Введите заново: ");
            }
        }
    }
}
