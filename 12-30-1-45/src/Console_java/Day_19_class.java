
package Console_java;
public class Day_19_class {
    String word;
    String speech;
    String des;
    public Day_19_class(String word, String speech, String des) {
        this.word = word;
        this.speech = speech;
        this.des = des;
    }
    void Output(){
        System.out.printf("%-10s (%-3s) :  %-10s\n",word,speech,des);
    }
}
