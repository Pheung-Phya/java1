
package GUI1;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Class representing an Item on the invoice
class Item {
    private String name;
    private int quantity;
    private double price;
    
    // Constructor
    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    // Calculate total price for the item (price * quantity)
    public double getTotalPrice() {
        return quantity * price;
    }
    
    // Display item details
    public String toString() {
        return String.format("%-20s %5d %10.2f %10.2f", name, quantity, price, getTotalPrice());
    }
}

// Class representing an Invoice
class Invoice {
    private ArrayList<Item> items;
    private double taxRate; // Tax rate as a percentage

    // Constructor
    public Invoice(double taxRate) {
        items = new ArrayList<>();
        this.taxRate = taxRate;
    }

    // Add an item to the invoice
    public void addItem(String name, int quantity, double price) {
        items.add(new Item(name, quantity, price));
    }

    // Calculate the subtotal (before tax)
    public double calculateSubtotal() {
        double subtotal = 0.0;
        for (Item item : items) {
            subtotal += item.getTotalPrice();
        }
        return subtotal;
    }

    // Calculate tax
    public double calculateTax() {
        return calculateSubtotal() * (taxRate / 100);
    }

    // Calculate total (subtotal + tax)
    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }

    // Print the receipt
    public void printReceipt() {
        System.out.println("===============================================");
        System.out.println("\t\tINVOICE RECEIPT");
        System.out.println("===============================================");
        
        // Print Date and Time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Date: " + now.format(formatter));
        System.out.println("===============================================");
        System.out.printf("%-20s %5s %10s %10s\n", "Item Name", "Qty", "Price", "Total");
        System.out.println("===============================================");
        
        // Print each item
        for (Item item : items) {
            System.out.println(item);
        }

        System.out.println("===============================================");
        System.out.printf("%-30s %10.2f\n", "Subtotal:", calculateSubtotal());
        System.out.printf("%-30s %10.2f\n", "Tax (" + taxRate + "%):", calculateTax());
        System.out.printf("%-30s %10.2f\n", "Total:", calculateTotal());
        System.out.println("===============================================");
        System.out.println("\tThank you for your purchase!");
        System.out.println("===============================================");
    }
}

// Main class for running the invoice program
public class InvoiceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Invoice invoice = new Invoice(10.0); // Tax rate of 10%
        
        // Adding items to the invoice
        while (true) {
            System.out.print("Enter item name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter price: ");
            double price = Double.parseDouble(scanner.nextLine());
            
            invoice.addItem(name, quantity, price);
        }

        // Print the invoice receipt
        invoice.printReceipt();
        
        scanner.close();
    }
}
