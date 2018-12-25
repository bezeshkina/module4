package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeCalcTest extends BaseTest {
    @Test(dataProvider = "valuesForTest", groups = {"simpleTest"})
    public void isNegativeCalTest(long a){
        Assert.assertTrue(calculator.isNegative(a));
    }

    @DataProvider(name = "valuesForTest")
    public Object[][] valuesForTest(){
        return new Object[][]{
                {-1},
                {0}
        };
    }

}
