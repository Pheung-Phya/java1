package Hybrid;
public class Teacher2 extends Student2{
        private String subject,room;
        public Teacher2() {
                  subject="don't know";
                  room="M3";
        }
        public Teacher2(String subject, String room, String id, String name, String gender, String address, String dob, double s1, double s2, double s3, double s4, double s5) {
                  super(id, name, gender, address, dob, s1, s2, s3, s4, s5);
                 this.subject = subject;
                 this.room = room;
        }
        public void Input(){
                  super.Input();
                 System.out.print("Enter Subject : ");  subject=cin.next();
                 System.out.print("Enter Room    : ");   room=cin.next();
        }
        public void Output(){
                 super.Output();
                 System.out.printf("%-10s %-10s");
        }
        
}
