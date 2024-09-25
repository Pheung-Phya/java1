
package Poly;

interface Sport{
    void setTeam();
    void setScore();
}

abstract class Football implements Sport{
       void Output(){
           System.out.println("My team name yakuza");
       }
       public void setScore(){
           System.out.println("We get score 200points");
       }
}


public class Interface_1{
    public static void main(String[] args) {
        Football fb = new Football() {
            public void setTeam() {
                System.out.println("My team has 15person");
            }
       };
        fb.setScore();
        fb.setTeam();
        fb.Output();
    }   
}
