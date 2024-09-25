
package Introduction_java;


public class Main_Computer_self extends Main_composition_1{

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public ComputerCase getComputercase() {
        return computercase;
    }

    public void setComputercase(ComputerCase computercase) {
        this.computercase = computercase;
    }
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computercase;
    
    public Main_Computer_self(String model,String manufacturer,Monitor monitor, Motherboard motherboard, ComputerCase computercase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computercase = computercase;
    }

    public Main_Computer_self(){
    }
    
}
