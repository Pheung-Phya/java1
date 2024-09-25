
public class Main_swap {

   
    public static void main(String[] args) {
        int x=10,y=30;
        System.out.println(x + " " + y);
        swap(x,y);
        System.out.println(x + " " + y);
    }
    public static void swap(int a,int b){
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a + " " + b);
    }
}
