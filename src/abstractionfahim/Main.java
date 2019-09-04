package abstractionfahim;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        SmartPhone fahimsPhone = new SamsungPhone();
        fahimsPhone.text("hello");

        SmartPhone iphX = new Iphone();

        iphX.setOperatingSystem();

        iphX.touchScreen();


    }
}
