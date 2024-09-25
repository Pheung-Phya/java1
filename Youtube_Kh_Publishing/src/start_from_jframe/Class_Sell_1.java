
package start_from_jframe;

import java.text.DecimalFormat;

public class Class_Sell_1 {
    long id;
    String name;
    long qty;
     float price;
    public Class_Sell_1() {
    }
    public Class_Sell_1(long id, String name, long qty, float price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    float getAmount(){
        return qty*price;
    }
    Class_Sell_1 copy(){
        Class_Sell_1 temp = new Class_Sell_1(id, name, qty,  price);
        return temp;
    }
    void show(){
        System.out.println(id+"\t"+name+"\t"+qty+"\t"+price+"\t"+getAmount());
    }
    String output(){
        DecimalFormat fm = new DecimalFormat("$#,##0.00");
        return id+"\t"+name+"\t"+qty+"\t"+price+"\t"+fm.format(getAmount());
    }
}
