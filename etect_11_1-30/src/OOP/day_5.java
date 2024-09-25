//
//package OOP;
//
//interface Mom{
//    void Output();
//    void Show();
//}
//
//class Son implements Mom{
//
//    @Override
//    public void Output() {
//        System.out.println("Output Function in Son");
//    }
//    @Override
//    public void Show() {
//        System.out.println("Show Function in Son");
//    } 
//}
//
//abstract class Duaghter implements Mom{
//
//    public Duaghter() {
//        System.out.println("Constructor Daughter");
//    }
//    public void Output(){
//        System.out.println("Output function");
//    }
//    public void Show(){
//        System.out.println("Show function");
//    }
//    abstract void Cout();
//    
//}
//
//class GrandSon extends Duaghter{
//    void Cout() {
//      }    
//}
//
//public class day_5 {
//    public static void main(String[] args) {
//       Son s = new  Son();
//       s.Output();
//       s.Show();
//        System.out.println("-----------------------------");
//       Mom m = new Son();
//       m.Show();
//       m.Output();
//        System.out.println("====================");
//        Duaghter d = new  GrandSon();
//        d.Output();
//        d.Show();
//       
//    }
//}
