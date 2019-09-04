package polymorphism.oop;

public class LandCalculator {

    int landSize1;
    int LandSize2;
    Boolean inMeter;

    public int calculateArea(int landSize1, int landSize2){

        int total = landSize1 * landSize2;
    return total;
    }

    public double calculateArea(double landSize1, double landSize2, Boolean inMeter) {
        double total = landSize1 * landSize2;
        if (inMeter.equals(false)) {
            total = (int) total;
            return total;
        } else
            return total;
    }
}
