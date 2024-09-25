
package Introduction_java;


public class Main_composition_1 {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;
    
    public Main_composition_1(){
        
    }
    public Main_composition_1(String model,String manufacturer){
        this.model=model;
        this.manufacturer=manufacturer;
    }
}

class Monitor extends Main_composition_1{
    private int size;
    private String resolution;
    public Monitor(String model, String manufacturer,int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }
    public void drawPixelAt(int x,int y,String color){
        System.out.println(String.format("Drawing pixel at %d,%d in color %s ",x,y,color));
    }
}
class Motherboard extends Main_composition_1{

    public Motherboard(String model,String manufacturer) {
        super(model,manufacturer);
    }  
    private int ramSlots;
    private int cardSlots;
    private int bios;

    public Motherboard( String model, String manufacturer,int ramSlots, int cardSlots, int bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program "+programName+" is nwo loading...");
    }
}
class ComputerCase extends Main_composition_1{
    private String powerSupply;
    private int hello;

    public ComputerCase(String model, String manufacturer,String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;

    }
    public ComputerCase (String model,String manufacturer) {
        super(model,manufacturer);
    }  
    public void pressPowerButton(){
        System.out.println("Power button pressed.");
    }
}
