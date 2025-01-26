package Ecommerce;

import java.util.ArrayList;

public class Order {
    int orderId;
    int customerId;
    
    ArrayList<Product> products = new ArrayList<>();
    double totalAmount;

    public Order(int orderId, int customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
    }

    public void addProduct(Product product, int quantity) {
    	
        if (product.stock >= quantity) {
        	
            product.stock -= quantity;
            products.add(product);
            
            totalAmount += product.price * quantity;
        } else {
            System.out.println("Insufficient stock for product: " + product.name);
        }
    }

    public String toString() {
        return "Order ID: " + orderId + ", Customer ID: " + customerId + ", Total Amount: " + totalAmount;
    }
}
