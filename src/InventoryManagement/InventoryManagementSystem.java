package InventoryManagement;

import java.util.ArrayList;
import java.util.List;


class Product {
    private String productName;
    private int productID;
    private int stockLevel;
    private double price;

    public Product(int productID, String productName, int stockLevel, double price) {
        this.productID = productID;
        this.productName = productName;
        this.stockLevel = stockLevel;
        this.price = price;
    }

  
    public String getProductName() {
        return productName;
    }

    public int getProductID() {
        return productID;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public double getPrice() {
        return price;
    }

    
    public boolean isLowStock() {
        return stockLevel < 10; 
    }


    public String toString() {
        return "Product(ID=" + productID + ", Name=" + productName + ", Stock Level=" + stockLevel + ", Price=" + price + ")";
    }
}

class Supplier {
    private String name;
    private String contactInfo;

    public Supplier(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public String toString() {
        return "Supplier[Name=" + name + ", Contact=" + contactInfo + "]";
    }
}


class Inventory {
    private List<Product> products = new ArrayList<>();

   
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product);
    }

    
    public void removeProduct(int productID) {
        products.removeIf(product -> product.getProductID() == productID);
        System.out.println("Product with ID " + productID + " removed.");
    }

    
    public void updateStockLevel(int productID, int newStockLevel) {
        for (Product product : products) {
            if (product.getProductID() == productID) {
                product.setStockLevel(newStockLevel);
                System.out.println("Updated stock level for product " + product.getProductName() + " to " + newStockLevel);
                return;
            }
        }
        System.out.println("Product with ID " + productID + " not found.");
    }

   
    public void displayLowStock() {
        System.out.println("Low stock products:");
        for (Product product : products) {
            if (product.isLowStock()) {
                System.out.println(product);
            }
        }
    }

    public void displayInventory() {
        System.out.println("Inventory list:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}


public class InventoryManagementSystem {
    public static void main(String[] args) {
       
        Product p1 = new Product(1, "Laptop", 5, 1000.00);
        Product p2 = new Product(2, "Phone", 20, 500.00);
        Product p3 = new Product(3, "Tablet", 8, 300.00);

        Supplier s1 = new Supplier("Tech Supplies Co.", "123-456-789");

       
        Inventory inventory = new Inventory();
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        
        inventory.displayInventory();
       
        inventory.updateStockLevel(1, 12);
       
        inventory.displayLowStock();
        
        inventory.removeProduct(2);

        inventory.displayInventory();
    }
}
