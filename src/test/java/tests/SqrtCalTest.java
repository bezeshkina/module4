package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalTest extends BaseTest {

    @Test(dataProvider = "valuesForTest", groups = {"simpleTest"})
    public void sqrtTest(double a, double expectedResult){
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation");
    }

    @DataProvider(name = "valuesForTest")
    public Object[][] valuesForSqrt(){
        return new Object[][]{
                {25, 5},
                {0, 0},
                {1, 1},
                {156, 12.489995996796797},
                {-25, 5}
        };
    }
}
