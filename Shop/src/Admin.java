import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    //Создает список покупателей и заполняет его покупателями из файла
    public ArrayList<Customer> createCustomersALFromFile() {
        ArrayList<Customer> array = new ArrayList<>();
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader("data/shopData/customers.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNext()) {
            String name = sc.next();
            int age = sc.nextInt();
            String gender = sc.next();

            array.add(new Customer(name, age, gender));
        }
        return array;

    }
    //Возвращает список ссылок для базы в правильном порядке
    public ArrayList<String> assignLink () {
        ArrayList<String> links = new ArrayList<>();
        links.add(0, "data/shopData/products/products1.txt");
        links.add(1, "data/shopData/products/products2.txt");
        links.add(2, "data/shopData/products/products3.txt");
        links.add(3,"data/shopData/products/products4.txt");
        links.add(4,"data/shopData/products/products5.txt");
        links.add(5,"data/shopData/products/products6.txt");
        return links;
    }
    //Создает список продутов и заполняет его продуктами из файла с определенной ссылкой
    public ArrayList<Product> createProductsFromFile(String link) {
        ArrayList<Product> array = new ArrayList<>();
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader(link));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNext()) {
            String name = sc.next();
            int price = sc.nextInt();
            String producer = sc.next();

            array.add(new Product(name, price, producer));
        }
        return array;
    }
    //Создает покупателя, ввод параметров с консоли
    private Customer createNewCustomer () {
        Scanner sc = new Scanner(System.in);
        System.out.println("имя возраст пол");
        String name = sc.next();
        int age = sc.nextInt();
        String gender = sc.next();
        Customer customer = new Customer(name, age, gender);
        return customer;
    }
    //Создает список продуктов для одного покупателя, ввод параметров с консоли
    private ArrayList<Product> createNewProductAL () {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        ArrayList<Product> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int price = sc.nextInt();
            String producer = sc.next();
            arrayList.add(new Product(name, price, producer));
        }
        return arrayList;
    }
    //Проверяет, делал ли человек заказ, вывод заказа
    public void checkOrder (String name, ArrayList<Order> orderArrayList) {
        boolean check = false;
        for (Order orderToCheck : orderArrayList) {
            if (name.equals(orderToCheck.getCustomer().getName())) {
                System.out.println("Найдено");
                orderToCheck.getOrder();
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Этого человека нет в списке покупателей.");
        }
    }
    //Создает новый заказ, ввод параметров с консоли, добавляет его в список всех заказов
    public void createNewOrder (ArrayList<Order> orderArrayList, ArrayList<Customer> customerArrayList) {
        Customer customer = createNewCustomer();
        ArrayList<Product> products = createNewProductAL();
        Order order = new Order(customer, products);
        orderArrayList.add(order);
        customerArrayList.add(customer);
    }
    //Создает заказ, заполнение параметров из файла, и добавляет их в список всех заказов
    public void createOrdersFromFile (ArrayList<Order> orderArrayList, ArrayList<String> linkArrayList) {
        ArrayList<Customer> customersFromFile = createCustomersALFromFile();
        for (int i = 0; i < customersFromFile.size(); i++) {
            ArrayList<Product> productsFromFile = createProductsFromFile(linkArrayList.get(i));
            orderArrayList.add(new Order(customersFromFile.get(i), productsFromFile));
        }
    }
}
