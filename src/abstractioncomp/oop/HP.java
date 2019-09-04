package abstractioncomp.oop;

public class HP extends Laptop implements Computer {

    public void process(){
        System.out.println("Computer process things");
    }

    public void store(){
        System.out.println("Computer store things");
    }

    public void view(){
        System.out.println("Computer can view things");
    }

    public void highendGraphics(){
        System.out.println("Highend graphics...");
    }

    public void heavyDutyLaptop(){
        System.out.println("Can work as heavy duty laptop");
    }

}
