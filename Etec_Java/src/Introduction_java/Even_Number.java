
package Introduction_java;


public class Even_Number {

    
    public static void main(String[] args) {
        int number = 4;
        int finishNumber=20;
        while(number<=20){
            number++;
            if(!(isEvenNumber(number))){
                continue;
            }
            System.out.println("Even Number : "+number);
        }
    }
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
}
