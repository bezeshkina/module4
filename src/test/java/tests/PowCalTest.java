package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalTest extends BaseTest {
    @Test(dataProvider = "testValues", groups = {"simpleTest"})
    public void powCalTest(double a, double b, double expectedResult){
        Assert.assertEquals(calculator.pow(a, b), expectedResult, "Invalid result");
    }

    @DataProvider(name = "testValues")
    public Object[][] testValues(){
        return new Object[][]{
                {1, 0, 1.0},
                {3, 2.1, 9},
                {-4, 1.7, -4},
                {8, -0.5, 0.125}
        };
    }
}
