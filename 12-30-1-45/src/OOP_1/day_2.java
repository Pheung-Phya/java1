//
//package OOP_1;
//import java.util.Scanner;
//
//class Employee{
//    private String name;
//    private String gender;
//    private String id;
//    private double salary;
//    public Employee(){
//        id=name=gender="null";
//        salary=0.0;
//    }
//    public Employee(String name, String gender, String id, double salary) {
//        this.name = name;
//        this.gender = gender;
//        this.id = id;
//        this.salary = salary;
//    }   
//    public void Input(){
//        Scanner cin = new Scanner(System.in);
//        System.out.print("Enter your ID         : ");   id=cin.next();
//        System.out.print("Enter your Name   : ");   name=cin.next();
//        System.out.print("Enter your Gender : ");   gender=cin.next();
//        System.out.print("Enter your Salary   : ");   salary=cin.nextFloat();
//    }
//    void Output(){
//        System.out.println(id+"\t"+name+"\t"+gender+"\t"+salary);
//    }
//    String getName(){
//        return name;
//    }
//    String getId(){
//        return id;
//    }
//}
//
//public class day_2 {
//    void Update(int n, Employee emp[]){
//        String update;
//        int i;
//        Scanner cin = new Scanner(System.in);
//        System.out.print("Which id do you want to update : ");
//        update=cin.next();
//        for(i=0;i<n;i++){
//            if(update.equals(emp[i].getId())){
//                emp[i].Input();
//            }
//        }
//    }
//    void Search(int n,Employee emp[]){
//         String search;
//         int i;
//         Scanner cin = new Scanner(System.in);
//         System.out.println("Which employee name do you want to search : ");
//         search=cin.next(); // 12 13 14 , n=3 ,search =14
//         for(i=0;i<n;i++){
//             if(search .equals(emp[i].getName()) ){
//                  emp[i].Output();
//             }
//         }
//    }
//    void Output(int n,Employee emp[]){
//        int i;
//        for(i=0;i<n;i++){
//            emp[i].Output();
//        }
//    }
//    day_2(){
//        int i,n=0,op;
//        Employee emp[]=new Employee[20];
//        Scanner cin = new Scanner(System.in);
//        do{
//            System.out.println("1. Input    Information");
//            System.out.println("2. Output  Information");
//            System.out.println("3. Search  Information");
//            System.out.println("4. Update  Information");
//            System.out.println("5. Delete   Information");
//            System.out.println("6. For Exit                    ");
//            System.out.println("----------------------------");
//            System.out.print("Please Select one option => ");
//            op=cin.nextInt();
//            switch(op){
//                case 1->{
//                    System.out.println("How many employee do you want to enter : ");
//                    n=cin.nextInt();
//                    for(i=0;i<n;i++){
//                        System.out.println("\n======> Employee "+(i+1));
//                        emp[i]=new Employee();
//                        emp[i].Input();
//                    }
//                }
//                case 2->{
//                    Output(n,emp);
//                }
//                case 3->{
//                    Search(n,emp);
//                }
//                case 4->{
//                    Update(n,emp);
//                }
//                case 5->{
//                    if(Delete(n,emp)){
//                        n--;
//                    }
//                }
//                case 6->{
//                    System.out.println("=====> Good bye .. Lai sin here");
//                    System.exit(1);
//                }
//                default->{
//                     System.out.println("You input wrong option.");
//                }
//            }
//        }while(true);
//    }
//    public static void main(String[] args) {
//         new day_2();
//    }   
//
//    private boolean Delete(int n, Employee[] emp) {
//         String delete;
//         int i,j;
//         Scanner cin = new Scanner (System.in);
//         System.out.print("Which id employee do you want to delete : ");
//         delete=cin.next();   //    13  14  0 : delete= 12 ,n=3
//         for(i=0;i<n;i++){
//             if(delete.equals(emp[i].getId())){
//                 for(j=i;j<n;j++){
//                     emp[j]=emp[j+1];
//                 }
//                 return true;
//             }
//         }
//         return false;
//    }
//}
//
