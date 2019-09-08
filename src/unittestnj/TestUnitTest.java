package unittestnj;

import org.testng.Assert;

public class TestUnitTest {

    public static void main(String[] args) {

        UnitTesting unitTesting = new UnitTesting();
        int addResult = unitTesting.add(200, 100);
        Assert.assertEquals(addResult, 300);


        int deductResult = unitTesting.deduct(200, 100);
        Assert.assertEquals(deductResult, 100);



    }
}
