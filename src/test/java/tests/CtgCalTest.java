package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgCalTest extends BaseTest {
    @Test(dataProvider = "testData", groups = {"trigonometricTest"})
    public void ctgTest (double a){
        Assert.assertEquals(calculator.ctg(a), 1/Math.tan(a), "Invalid result of operation");
    }

    @DataProvider(name = "testData")
    public Object[][] testValueForTest(){
        return new Object[][]{
                {1}
        };
    }
}
