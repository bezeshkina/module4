package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDCalTest extends BaseTest{
    @Test(dataProvider = "testValues", groups = {"simpleTest"})
    public void multDoubleValuesTest(double a, double b, double expectedResult){
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation");

    }

    @DataProvider(name = "testValues")
    public Object[][] testValues(){
        return new Object[][]{
                {1, 0, 0.0},
                {-1.1, -1.1, 1.21},
                {-1.1, 1.1, -1.21}
        };
    }
}
