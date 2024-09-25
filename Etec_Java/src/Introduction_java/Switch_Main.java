
package Introduction_java;

public class Switch_Main {
    public static void main(String[] args){
        String month="jan";

        switch(month){
            case "jan","feb" -> {
                System.out.println("hell0");
            }
            case "march","april"->System.out.println("HIllll");
        }
        checkOfWeek(1);
         checkOfWeek(2);
    }
    public static void checkOfWeek(int day){
        String dayOfWeek =  switch(day){
            case 1 -> "monday";
            case 2->"Tuesday";
            default ->{yield "notday";}
        };
        System.out.println(day + " Stand for " + dayOfWeek);
    }
}
