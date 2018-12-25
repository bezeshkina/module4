package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLCalTest extends BaseTest{
    @Test(dataProvider = "testValues", groups = {"simpleTest"})
    public void multLongValuesTest(long a, long b, long expectedResult){
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation");

    }

    @DataProvider(name = "testValues")
    public Object[][] testValues(){
        return new Object[][]{
                {1, 0, 0},
                {-1, -1, 1},
                {-1, 1, -1}
        };
    }
}
