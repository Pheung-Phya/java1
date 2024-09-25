
package OOP;
class Student2{
    protected String id,name;
    public Student2(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void Output(){
        System.out.printf("%-10s %-10s",id,name);
    }
}

class Science extends Student2{
       private float math,khmer;
    public Science(String id, String name,float math,float khmer) {
        super(id, name);
        this.math=math;
        this.khmer=khmer;
    }
    public void Output() {
        super.Output();
        System.out.printf("%-10.2f %-10.2f\n",math,khmer);
    }   
}

class Art extends Student2{
    private Double drawing,design;
    public Art(String id, String name,Double d,Double ds) {
        super(id, name);
        this.drawing = d;
        design = ds;
    }
   public void Output(){
        super.Output();
        System.out.printf("%-10.2f %-10.2f\n",drawing,design);
    }
    
}

public class day_3 {
    public static void main(String[] args) {
        System.out.println("Scence Student");
         Science sc = new Science("123", "phya", 99.99f, 80.90f);
         sc.Output();
         System.out.println("==============================================");
         System.out.println("Art Student");
         Art art = new Art("124","Trea", 99.99, 88.88);
         art.Output();
         
    }
    
}
