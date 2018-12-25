package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivCalTest extends BaseTest {
    @Test(expectedExceptions = NumberFormatException.class, groups = {"exceptionTest"}, dataProvider = "valuesForTestDividingByZero")
    public void divideByZeroTest(long a, long b) {
        calculator.div(a, b);
    }

    @Test(dataProvider = "valuesForTest", groups = {"simpleTest"})
    public void divideLongValues(long a, long b, double expectedResult) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "invalid result of operation");
    }

    @DataProvider(name = "valuesForTest")
    public Object[][] valuesForDiv(){
        return new Object[][]{
                {1, 1, 1},
                {2, -1, -2},
                {3, 2, 1},
                {2, 3, 0}
        };
    }

    @DataProvider(name = "valuesForTestDividingByZero")
    public Object[][] valuesForDivByZero(){
        return new Object[][]{
                {4, 0}
        };
    }
}