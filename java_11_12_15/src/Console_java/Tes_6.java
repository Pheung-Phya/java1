package Console_java;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Tes_6 {
    public static void main(String[] args) {
        int ouse ,nuse;
        int total,pay;
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter New Month : "); nuse = cin.nextInt();
        System.out.print("Enter Old Month : ");    ouse=cin.nextInt();
        total = nuse-ouse;
        if(total>=1 && total<=10){
            pay = total*500;
        }else if(total>10 && total<=20){
            pay = total*550;
        }else if(total>20 && total<=30){
            pay = total * 600;
        }else{
            pay = total*650;
        }
        System.out.println("=========================");
        System.out.printf("Total Use = %dkw\n",total);
        System.out.printf("You must pay %d riel\n",pay);
        
    }    
}
