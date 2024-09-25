//package OOP_1;
//import java.util.Scanner;
//class Person{
//        protected int id;
//        protected String name,sex,dob,addres;
//        public Person(){
//                  id=0;
//                  name=sex=dob=addres="None";
//        }
//        public Person(int id, String name, String sex, String dob, String addres) {
//                this.id = id;
//                this.name = name;
//                this.sex = sex;
//                this.dob = dob;
//                this.addres = addres;
//        }       
//        public void Input(){
//                  Scanner cin = new Scanner(System.in);
//                  System.out.print("Enter Your ID           : ");
//                  id=cin.nextInt();
//                  System.out.print("Enter Your Name     : ");
//                  name=cin.next();
//                  System.out.print("Enter Your Sex         : ");
//                  sex=cin.next();
//                  System.out.print("Enter Your Address : ");
//                  addres=cin.next();
//                  System.out.print("Enter Your DOB        : ");
//                  dob=cin.next();
//        }
//        public void Output(){
//                  System.out.println(id+"\t"+name+"\t"+sex+"\t"+addres+"\t"+dob);
//        }
//}
//
//class Student extends Person{
//        private float score1,score2,score3;
//        public Student(){
//                  super();
//                  score1=score2=score3=0.0f;
//        }
//        public Student(float score1, float score2, float score3, int id, String name, String sex, String dob, String addres) {
//                super(id, name, sex, dob, addres);
//                this.score1 = score1;
//                this.score2 = score2;
//                this.score3 = score3;
//        }      
//        public void Input(){
//                  super.Input();
//                  
//        }
//        public void Output(){
//                  super.Output();
//        }
//}
//
//
//public class day_3{
//         public static void main(String[] args){
//                  Employee emp[] = new Employee[30];
//                  Student stu[]=new Student[30];
//                  int i,n=0,n1=0,op;
//                  boolean f=true;
//                  Scanner cin = new Scanner(System.in);
//                  do{
//                          System.out.println("1. System Student");
//                          System.out.println("2. System Employee");
//                          System.out.println("----------------------------");
//                          op=cin.nextInt();
//                          switch(op){
//                                    case 1->{
//                                            f=true;
//                                            while(f){
//                                                    int op1;
//                                                    System.out.println("1.Input Information");
//                                                    System.out.println("2.Output Information");
//                                                    System.out.println("3.Search Information");
//                                                    System.out.println("4.for Exit ");
//                                                    System.out.print("Choose one option => ");
//                                                    op1=cin.nextInt();
//                                                    switch(op1){
//                                                              case 1->{
//                                                                      System.out.println("How many Student do you want to input : ");
//                                                                      n=cin.nextInt();
//                                                                      for(i=0;i<n;i++){
//                                                                               stu[i]=new Student();
//                                                                               stu[i].Input();
//                                                                      }
//                                                              }
//                                                              case 2->{
//                                                                       for(i=0;i<n;i++){
//                                                                               emp[i].Output();
//                                                                       }
//                                                              }
//                                                              case 3->{
//                                                                       int search;
//                                                              }
//                                                              case 4->{
//                                                                      f=false;
//                                                              }
//                                                    }
//                                            }
//                                    }
//                                    case 2->{
//                                            while(true){
//                                                    System.out.println("1.Input Information");
//                                                    System.out.println("2.Output Information");
//                                                    System.out.println("3.Search Information");
//                                                    System.out.println("4.for Exit");
//                                            }
//                                    }
//                          }
//                  }while(true);
//         }
//}