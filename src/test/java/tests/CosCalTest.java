package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalTest extends BaseTest {
    @Test(dataProvider = "testData", groups = {"trigonometricTest"})
    public void cosTest (double a){
        Assert.assertEquals(calculator.cos(a), Math.cos(a), "Invalid result of operation");
    }

    @DataProvider(name = "testData")
    public Object[][] testValueForTest(){
        return new Object[][]{
                {0},
                {1},
                {Math.PI},
                {2*Math.PI}
        };
    }
}
