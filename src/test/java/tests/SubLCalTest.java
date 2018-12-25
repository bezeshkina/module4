package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubLCalTest extends BaseTest {
        @Test(dataProvider = "testValues", groups = {"simpleTest"})
        public void subLongValuesTest(long a, long b, long expectedResult){
            long result = calculator.sub(a, b);
            Assert.assertEquals(result, expectedResult, "Invalid result of operation");

        }

        @DataProvider(name = "testValues")
        public Object[][] testValues(){
            return new Object[][]{
                    {1234, 45, 1189},
                    {0, 12345, -12345}
            };
        }

}
