
package Introduction;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class Topic{
    private String word;
    private String speech;
    private String descr;

    public Topic(String word, String speech, String descr) {
        this.word = word;
        this.speech = speech;
        this.descr = descr;
    }

    public String getDescr() {
        return descr;
    }

    public String getWord() {
        return word;
    }

    public String getSpeech() {
        return speech;
    }
    
}
public class project_end_file2 {

    public static void main(String[] args) {
            Hashtable<Integer,Topic> ht=new Hashtable<>();
           int i,op,n=0;
           Scanner cin = new Scanner(System.in);
           String w,s,d;
            while(true){
                System.out.println("[1]. Add");
                System.out.println("[2]. Output");
                System.out.println("[3]. Search");
                System.out.println("[4]. Update");
                System.out.print("Select one option => ");
                op=cin.nextInt();
                switch(op){
                    case 1->{
                        System.out.print("How many word do you want to add : ");
                        n= cin.nextInt();
                        for(i=0;i<n;i++){
                            System.out.print("Enter Word : "); w = cin.next();
                            System.out.print("Enter Speech : "); s=cin.next();
                            System.out.print("Enter Describtion : "); d=cin.next();
                            Topic t = new Topic(w, s, d);
                            ht.put(i+1, t);
                        }
                    }
                    case 2->{
                        for(Map.Entry map:ht.entrySet()){
                            Topic topic=(Topic) map.getValue();
                           
                            System.out.println(topic.getWord()+" ("+topic.getSpeech()+") : "+topic.getDescr());
                        }
                    }
                    case 3->{
                        String search;
                    System.out.println("Enter word to search : ");
                    search = cin.next();
                    for (Map.Entry<Integer, Topic> map : ht.entrySet()) {
                        Topic topic = map.getValue();
                        if (search.equalsIgnoreCase(topic.getWord())) {
                            System.out.println(topic.getWord() + " (" + topic.getSpeech() + ") : " + topic.getDescr());
                        }
                    }
                    }
                    case 4->{
                         String update;
                    System.out.println("Enter word to search : ");
                    update = cin.next();
                    for (Map.Entry<Integer, Topic> map : ht.entrySet()) {
                        Topic topic = map.getValue();
                        if (update.equalsIgnoreCase(map.getValue().getWord())) {
                            System.out.print("Enter Word : "); w = cin.next();
                            System.out.print("Enter Speech : "); s=cin.next();
                            System.out.print("Enter Describtion : "); d=cin.next();
                            Topic t = new Topic(w, s, d);
                            ht.put(map.getKey(), t);
                        }
                    }
                    }
                }
            }
    }
    
}
