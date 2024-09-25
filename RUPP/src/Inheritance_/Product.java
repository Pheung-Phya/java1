
package Inheritance_;

public class Product extends Single{
    String code;
    float price;

    public Product() {
        super("null","null");
        code ="null";
        price=0.0f;
    }
    
    public Product(String code, float price, String name, String unit) {
        super(name, unit);
        this.code = code;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", price=" + price + super.toString()+"}";
    }       
}
