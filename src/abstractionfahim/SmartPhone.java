package abstractionfahim;

public abstract class SmartPhone implements Phone {

    public abstract void touchScreen();

    public abstract void setOperatingSystem();

    public void browsing(){
        System.out.println("Smart phone browsing");
    }

    public void call(){
        System.out.println("Smart phone calling");
    }

    public void text(String message){
        System.out.println("Texted :" + message);
    }

}
