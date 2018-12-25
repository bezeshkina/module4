package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDCalTest extends BaseTest {
    @Test(dataProvider = "testValues", groups = {"simpleTest"})
    public void subDoubleValuesTest(double a, double b, double expectedResult){
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation");

    }

    @DataProvider(name = "testValues")
    public Object[][] testValues(){
        return new Object[][]{
                {11.1, 0.11, 10.99},
                {-1.1, -0.11, -0.99},
                {0.12, -12.0, 12.12},
                {0, -12, 12.0},
                {0, 1, -1.0}
        };
    }
}
