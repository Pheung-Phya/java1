
package Introduction_java;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main_functionDemo {
    
    void CheckDate(){
        int day,month,year;
        GregorianCalendar date = new GregorianCalendar();
        
        day=date.get(Calendar.DAY_OF_MONTH);
        month=date.get(Calendar.MONTH);
        year=date.get(Calendar.YEAR);
        
        int second,minut,hour;
        second=date.get(Calendar.SECOND);
        minut=date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);
        
        System.out.println("Current Date : "+month+"/"+day+"/"+year);
        System.out.println("Current Time : "+hour+":"+minut+":"+second);
    }
     Main_functionDemo(){
        CheckDate();
    }
}
