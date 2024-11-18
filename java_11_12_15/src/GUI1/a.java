//
//package GUI1;
//
//import net.sf.jasperreports.engine.*;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
//import java.util.*;
//
//public class ProductReportGenerator {
//
//    public static void main(String[] args) {
//        try {
//            // 1. Load the compiled Jasper report from .jrxml (or use .jasper if already compiled)
//            String reportPath = "path/to/product_report.jrxml";
//            
//            // 2. Compile the JRXML file
//            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
//            
//            // 3. Create a list of products (this could come from a database in real scenarios)
//            List<Product> productList = Arrays.asList(
//                new Product(1, "Laptop", 10, 999.99),
//                new Product(2, "Phone", 50, 499.99),
//                new Product(3, "Tablet", 30, 299.99)
//            );
//            
//            // 4. Convert product list to JRBeanCollectionDataSource
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(productList);
//            
//            // 5. Set parameters (if needed) – in this case, it's empty
//            Map<String, Object> parameters = new HashMap<>();
//            
//            // 6. Fill the report with data
//            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//            
//            // 7. Export the report to a PDF file
//            JasperExportManager.exportReportToPdfFile(jasperPrint, "path/to/output/product_report.pdf");
//            
//            System.out.println("Report generated successfully!");
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Product class to represent product data
//    public static class Product {
//        private int id;
//        private String name;
//        private int quantity;
//        private double price;
//
//        public Product(int id, String name, int quantity, double price) {
//            this.id = id;
//            this.name = name;
//            this.quantity = quantity;
//            this.price = price;
//        }
//
//        // Getters and setters for JasperReports to access fields
//        public int getId() { return id; }
//        public String getName() { return name; }
//        public int getQuantity() { return quantity; }
//        public double getPrice() { return price; }
//    }
//}
