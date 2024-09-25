
package jspereport_test;
public class Report_ {
    private String name;
    private int qty;
    private double price,amount;
    public Report_() {
    }

    public Report_(String name, int qty, double price, double amount) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    
    
}
