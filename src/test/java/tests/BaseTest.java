package tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    protected Calculator calculator;

    @BeforeMethod(groups = {"simpleTest", "exceptionTest"})
    public void setUp(){
        calculator = new Calculator();
    }

    @AfterMethod(groups = {"simpleTest", "exceptionTest"})
    public void tearDown() { calculator = null; }
}
