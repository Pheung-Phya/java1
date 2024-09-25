
package OOP;

class Test{
    private int x,y,z;
    public Test(){
        x=0;
        y=0;
        z=0;
    }

    public Test(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Test(int x, int y) {
        this.x = x;
        this.y = y;   
    }
   
    public void Output(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
    }
    
    
}

public class day_1 {
    public static void main(String[] args) {
       Test t = new Test(10, 20, 30);
       Test t1 = new Test(90, 80);
       
       t.Output();
       t1.Output();
       
    }
    
}
