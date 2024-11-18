package Hybrid;
public class Student2 extends Person2{
        private double s1,s2,s3,s4,s5;
        public Student2() {
                  super();
                  s1=s2=s3=s4=s5;
        }

        public Student2(String id, String name, String gender, String address, String dob,double s1, double s2, double s3, double s4, double s5) {
                  super(id, name, gender, address, dob);
                  this.s1 = s1;
                  this.s2 = s2;
                  this.s3 = s3;
                  this.s4 = s4;
                  this.s5 = s5;
        }
        public void Input(){
                  super.Input();
                  System.out.print("Enter Score1 : "); s1=cin.nextDouble();
                  System.out.print("Enter Score2 : "); s2=cin.nextDouble();
                  System.out.print("Enter Score3 : "); s3=cin.nextDouble();
                  System.out.print("Enter Score4 : "); s4=cin.nextDouble();
                  System.out.print("Enter Score5 : "); s5=cin.nextDouble();
        }
        public void Output(){
                  super.Output();
                  System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f %-10.2f",s1,s2,s3,s4,s5);
        }
        
}
