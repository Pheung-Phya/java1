
package Java_Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Map_List {
    public static void main(String[] args) {        
        ArrayList<HashMap<String,String>> listmap =new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        map.put("A","Apple");
        map.put("B", "Book");
        map.put("C", "Car");        
        listmap.add(map);
        //System.out.println(listmap);
        
        for(HashMap<String, String> mp : listmap){
                  //System.out.println(mp);
                  for(Map.Entry m:mp.entrySet()){
                           // System.out.println(m);
                           System.out.println(m.getKey() + " = "+m.getValue());
                  }
        }
        
    }  
}
