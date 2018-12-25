package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveCalTest extends BaseTest {
    @Test(dataProvider = "valuesForTest", groups = {"simpleTest"})
    public void isPositiveCalTest(long a){
        Assert.assertTrue(calculator.isPositive(a));
    }

    @DataProvider(name = "valuesForTest")
    public Object[][] valuesForTest(){
        return new Object[][]{
                {1},
                {0}
        };
    }
}
