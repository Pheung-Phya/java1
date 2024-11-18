//
//package GUI1;
//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.*;
//import java.io.FileOutputStream;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//// Class representing an Item on the invoice
//class Item {
//    private String name;
//    private int quantity;
//    private double price;
//    
//    public Item(String name, int quantity, double price) {
//        this.name = name;
//        this.quantity = quantity;
//        this.price = price;
//    }
//
//    public double getTotalPrice() {
//        return quantity * price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//// Class representing an Invoice
//class Invoice {
//    private ArrayList<Item> items;
//    private double taxRate;
//
//    public Invoice(double taxRate) {
//        items = new ArrayList<>();
//        this.taxRate = taxRate;
//    }
//
//    public void addItem(String name, int quantity, double price) {
//        items.add(new Item(name, quantity, price));
//    }
//
//    public double calculateSubtotal() {
//        double subtotal = 0.0;
//        for (Item item : items) {
//            subtotal += item.getTotalPrice();
//        }
//        return subtotal;
//    }
//
//    public double calculateTax() {
//        return calculateSubtotal() * (taxRate / 100);
//    }
//
//    public double calculateTotal() {
//        return calculateSubtotal() + calculateTax();
//    }
//
//    // Generate PDF for the invoice receipt
//    public void printToPDF(String filePath) {
//        Document document = new Document();
//        try {
//            PdfWriter.getInstance(document, new FileOutputStream(filePath));
//            document.open();
//
//            // Title
//            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLACK);
//            Paragraph title = new Paragraph("Invoice Receipt", titleFont);
//            title.setAlignment(Element.ALIGN_CENTER);
//            document.add(title);
//
//            document.add(new Paragraph("\n")); // Add space
//
//            // Date
//            LocalDateTime now = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//            Paragraph date = new Paragraph("Date: " + now.format(formatter));
//            document.add(date);
//
//            document.add(new Paragraph("\n")); // Add space
//
//            // Create table for items
//            PdfPTable table = new PdfPTable(4);
//            table.setWidthPercentage(100);
//            table.setSpacingBefore(10f);
//            table.setSpacingAfter(10f);
//            float[] columnWidths = {3f, 1f, 2f, 2f};
//            table.setWidths(columnWidths);
//
//            // Table Header
//            PdfPCell cell1 = new PdfPCell(new Paragraph("Item Name"));
//            PdfPCell cell2 = new PdfPCell(new Paragraph("Qty"));
//            PdfPCell cell3 = new PdfPCell(new Paragraph("Price"));
//            PdfPCell cell4 = new PdfPCell(new Paragraph("Total"));
//
//            table.addCell(cell1);
//            table.addCell(cell2);
//            table.addCell(cell3);
//            table.addCell(cell4);
//
//            // Table Body
//            for (Item item : items) {
//                table.addCell(item.getName());
//                table.addCell(String.valueOf(item.getQuantity()));
//                table.addCell(String.format("%.2f", item.getPrice()));
//                table.addCell(String.format("%.2f", item.getTotalPrice()));
//            }
//
//            document.add(table);
//
//            // Subtotal, Tax, and Total
//            Paragraph subtotal = new Paragraph("Subtotal: " + String.format("%.2f", calculateSubtotal()));
//            document.add(subtotal);
//
//            Paragraph tax = new Paragraph("Tax (" + taxRate + "%): " + String.format("%.2f", calculateTax()));
//            document.add(tax);
//
//            Paragraph total = new Paragraph("Total: " + String.format("%.2f", calculateTotal()));
//            document.add(total);
//
//            document.add(new Paragraph("\nThank you for your purchase!"));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            document.close();
//        }
//    }
//}
//
//// Main class for running the invoice program
//public class pdf {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Invoice invoice = new Invoice(10.0); // Tax rate of 10%
//        
//        // Adding items to the invoice
//        while (true) {
//            System.out.print("Enter item name (or 'done' to finish): ");
//            String name = scanner.nextLine();
//            if (name.equalsIgnoreCase("done")) {
//                break;
//            }
//            System.out.print("Enter quantity: ");
//            int quantity = Integer.parseInt(scanner.nextLine());
//            System.out.print("Enter price: ");
//            double price = Double.parseDouble(scanner.nextLine());
//            
//            invoice.addItem(name, quantity, price);
//        }
//
//        // Print the invoice receipt to a PDF file
//        System.out.print("Enter PDF file path (e.g., invoice.pdf): ");
//        String filePath = scanner.nextLine();
//        invoice.printToPDF(filePath);
//
//        System.out.println("Invoice PDF created successfully!");
//
//        scanner.close();
//    }
//}
