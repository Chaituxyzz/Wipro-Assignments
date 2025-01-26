package Ecommerce;

import java.util.ArrayList;
import java.util.Scanner;

public class EcommerceSystem {

    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private int nextOrderId = 1;

    public void addProduct(int id, String name, double price, int stock) {
        products.add(new Product(id, name, price, stock));
        System.out.println("Product added successfully.");
    }

    public void addCustomer(int id, String name, String email) {
        customers.add(new Customer(id, name, email));
        System.out.println("Customer added successfully.");
    }

    public void createOrder(int customerId) {
        Customer customer = findCustomerById(customerId);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        Order order = new Order(nextOrderId++, customerId);
        System.out.println("Creating order for customer: " + customer.name);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Product ID to add to order (or 0 to finish): ");
            int productId = scanner.nextInt();
            if (productId == 0) break;

            Product product = findProductById(productId);
            if (product == null) {
                System.out.println("Product not found.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            order.addProduct(product, quantity);
        }

        orders.add(order);
        System.out.println("Order created successfully: " + order);
    }

    public void listProducts() {
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void listCustomers() {
        System.out.println("Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void listOrders() {
        System.out.println("Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    private Product findProductById(int id) {
        for (Product product : products) {
            if (product.id == id) {
                return product;
            }
        }
        return null;
    }

    private Customer findCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.id == id) {
                return customer;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        EcommerceSystem system = new EcommerceSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nE-commerce Product Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Add Customer");
            System.out.println("3. Create Order");
            System.out.println("4. List Products");
            System.out.println("5. List Customers");
            System.out.println("6. List Orders");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter Product Price: ");
                    double productPrice = scanner.nextDouble();
                    System.out.print("Enter Product Stock: ");
                    int productStock = scanner.nextInt();
                    system.addProduct(productId, productName, productPrice, productStock);
                    break;

                case 2:
                    System.out.print("Enter Customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter Customer Email: ");
                    String customerEmail = scanner.nextLine();
                    system.addCustomer(customerId, customerName, customerEmail);
                    break;

                case 3:
                    System.out.print("Enter Customer ID to create order: ");
                    customerId = scanner.nextInt();
                    system.createOrder(customerId);
                    break;

                case 4:
                    system.listProducts();
                    break;

                case 5:
                    system.listCustomers();
                    break;

                case 6:
                    system.listOrders();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
