
package product;

public class Product {
    private int id;
    private String userName;
    private float price;
    private String addDate;
    private byte[] picture;
    Product(int pId,String pUserName,float pPrice,String pAddDate,byte[] pImage){
        this.id=pId;;
        this.userName=pUserName;
        this.price=pPrice;
        this.addDate=pAddDate;
        this.picture=pImage;
    }
    int getId(){
        return id;
    }
    String getName(){
        return userName;
    }
    public float getPrice(){
        return price;
    }
    String getAddDate(){
        return addDate;
    }
    public byte[] getImage(){
        return picture;
    }
}
