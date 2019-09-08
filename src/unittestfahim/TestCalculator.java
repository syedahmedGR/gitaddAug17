package unittestfahim;


import org.junit.Assert;
import org.junit.Test;

/**
 *  test case 1: adding two whole numbers
 */

public class TestCalculator {

    @Test
    public void testAddingTwoPositiveWholeNumbers() {
        int num1 = 10, num2 = 15;
        int actualResult = Calculator.add(num1, num2);
        int expectedResult = 25;
        Assert.assertEquals(expectedResult, actualResult);
    }

    //  - addiing two negative numbers gives you expected result
    @Test
    public void testAddingTwoNegativeWholeNumbers() {

        int num1 = -10, num2 = -15;
        int actualResult = Calculator.add(num1, num2);
        int expectedResult = -25;
        Assert.assertEquals(expectedResult,actualResult);
    }

    // - Adding positive and negative number gives you expeceted result
    @Test
    public  void testAddingPositiveNegativeWholeNumbers(){
        int num1 = 10, num2 = -15;
        int actualResult = Calculator.add(num1, num2);
        int expectedResult = -5;
        Assert.assertEquals(expectedResult,actualResult);
    }

    // test case for division
    // case1: dividing two whole numbers
    // case2: dividing with num2 greater than num1
    // case3: dividing negative numbers
    // case4: dividing by 0
    // case5: dividing by an add divisor
    // case6: dividing by an even divisor


}
