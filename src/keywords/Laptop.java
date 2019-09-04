package keywords;

public class Laptop extends Computer {

    int ramSize = 10;

    public Laptop(int ramSize){

        super( 8);
        System.out.println("Parent class or Computer ramsize :" + ramSize);
        System.out.println(" sub class or Laptop Ramsize :" + this.ramSize);
    }
    public void displaySize(){
        super.assembleMonitor();
        System.out.println("15 inch");
    }

    public void assembleComputer(){
        System.out.println("message");
    }
    /* can be overridding the public method
    @Override
    public void assembleBrand(){

    } */

    /* cannot be overriden since its a final public in super class
    public void assembleBrand(){
        System.out.println("Brand machine can't be parts can't be incorprate");
    } */


}
