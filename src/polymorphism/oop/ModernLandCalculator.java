package polymorphism.oop;

public class ModernLandCalculator extends LandCalculator {



    @Override
    public double calculateArea (double landSize1, double landSize2, Boolean inMeter) {

        double minusBoundaryArea = 100.50;
        double total = landSize1 * landSize2 - minusBoundaryArea;
        if (inMeter.equals(true)) {
            return total;

        } else
            return total = (int) total;

    }
}

