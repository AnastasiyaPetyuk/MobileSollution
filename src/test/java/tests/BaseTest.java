package tests;

import browser.Browser;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class BaseTest {
    public static final Logger logger = Logger.getLogger(BaseTest.class.getName());
    protected AndroidDriver driver;

    @BeforeSuite
    public void setUpDriver() throws MalformedURLException {
        logger.info("set up driver");
        driver = Browser.setupDriver();
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }
}
