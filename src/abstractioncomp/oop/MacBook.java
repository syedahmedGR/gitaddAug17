package abstractioncomp.oop;

public class MacBook extends Laptop implements Computer {

    public void process(){
        System.out.println("Computer process things");
    }

    public void store(){
        System.out.println("Computer store things");
    }

    public void view(){
        System.out.println("Computer can view things");
    }


    public void heavyDutyLaptop(){
        System.out.println("its a heavy duty machine");
    }
}
