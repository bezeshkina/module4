package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalcTest extends BaseTest{
    @Test(dataProvider = "testData", groups = {"trigonometricTest"})
    public void sinTest (double a){
        Assert.assertEquals(calculator.sin(a), Math.sin(a), "Invalid result of operation");
    }

    @DataProvider(name = "testData")
    public Object[][] testValueForTest(){
        return new Object[][]{
                {0},
                {1},
                {Math.PI / 2},
        };
    }
}
