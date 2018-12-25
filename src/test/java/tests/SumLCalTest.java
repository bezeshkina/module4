package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLCalTest extends BaseTest {
    @Test(dataProvider = "testValues", groups = {"simpleTest"})
    public void sumLongValuesTest(long a, long b, long expectedResult) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation");

    }

    @DataProvider(name = "testValues")
    public Object[][] testValues(){
        return new Object[][]{
                {1234, 45, 1279},
                {0, 12345, 12345}
        };
    }

}
