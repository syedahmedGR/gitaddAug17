package polymorphism.oop;

public class TestLandCalculator {

    public static void main(String[] args) {

        LandCalculator myLand = new LandCalculator();
        System.out.println( "land area :" + myLand.calculateArea(600, 700));

        ModernLandCalculator newLand = new ModernLandCalculator();
        System.out.println("Modern land area :" + newLand.calculateArea(850.50, 900.50, true));

    }
}
