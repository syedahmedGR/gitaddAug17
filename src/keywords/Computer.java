package keywords;
// this is the demo of using SUPER keyword
public class Computer {
    int ramSize;
    public Computer(){}
    public Computer(int ramSize){
        this.ramSize = ramSize;
    }
    public void assembleComputer(){
        System.out.println("Parts are developed in different countries ");
    }

    public void assembleMonitor(){
        System.out.println("Computer Monitor is Retina Screen");
    }
    final public void assembleBrand(){
        System.out.println("Brand machine can't be parts can't be incorprate");
    }
}