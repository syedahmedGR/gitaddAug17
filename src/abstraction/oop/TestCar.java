package abstraction.oop;

public class TestCar {

    public static void main(String[] args) {
        Car corrola = new Toyota();
        corrola.shape(); // we can have 3 methods but can't have the enegy() method

        // difference between corrola and lexus
        Toyota lexus = new Toyota();
        lexus.start();
        lexus.energy();

        MotorCar model3 = new Toyota();
        model3.drive();

        model3.hybridEngine();
    }
}
