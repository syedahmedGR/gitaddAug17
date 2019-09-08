package abstractioncomp.oop;

public class TestLaptop {

    public static void main(String[] args) {


        MacBook macbookPro = new MacBook();
        macbookPro.process();
        macbookPro.store();
        macbookPro.view();
        macbookPro.heavyDutyLaptop();

        Laptop myLaptop = new MacBook();
        myLaptop.convertable();

        HP spectre = new HP();
        spectre.heavyDutyLaptop();
        spectre.highendGraphics();


    }
}
