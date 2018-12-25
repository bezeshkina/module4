package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDCalcTest extends BaseTest {
    @Test(dataProvider = "testValues", groups = {"simpleTest"})
    public void sumDoubleValuesTest(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation");

    }

    @DataProvider(name = "testValues")
    public Object[][] testValues(){
        return new Object[][]{
                {12.0, 45, 57.0},
                {0.13, 1, 1.13},
                {0, 0, 0.0},
                {-1.0, 1.13, 0.13}
        };
    }

}
