package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgCalTest extends BaseTest {
    @Test(dataProvider = "testData", groups = {"trigonometricTest"})
    public void tgTest (double a){
        Assert.assertEquals(calculator.tg(a), Math.tan(a), "Invalid result of operation");
    }

    @DataProvider(name = "testData")
    public Object[][] testValueForTest(){
        return new Object[][]{
                {1}
        };
    }
}
