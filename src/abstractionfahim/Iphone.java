package abstractionfahim;

public class Iphone extends SmartPhone {

    @Override
    public void touchScreen() {
        System.out.println("this is apple touch screen");
    }

    @Override
    public void setOperatingSystem() {
        System.out.println("this is IOS op system");
    }
}
