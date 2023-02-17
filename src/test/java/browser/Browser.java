package browser;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static config.ConfigReader.emulatorConfig;

public class Browser {
    protected static AndroidDriver driver;
    private static final String PLATFORM_NAME = emulatorConfig.platformName();
    private static final String DEVICE_NAME = emulatorConfig.deviceName();
    private static final String APP = emulatorConfig.app();
    private static final Boolean NO_RESET = emulatorConfig.noReset();
    private static final String NEW_COMMAND_TIMEOUT = emulatorConfig.newCommandTimeout();
    private static final Boolean CONNECT_HARDWARE_KEYBOARD = emulatorConfig.connectHardwareKeyboard();
    private static final String URL = emulatorConfig.remoteUrl();

    private Browser() {
    }

    public static AndroidDriver setupDriver() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", PLATFORM_NAME);
            desiredCapabilities.setCapability("deviceName", DEVICE_NAME);
            desiredCapabilities.setCapability("app", APP);
            desiredCapabilities.setCapability("noReset", NO_RESET);
            desiredCapabilities.setCapability("newCommandTimeout", NEW_COMMAND_TIMEOUT);
            desiredCapabilities.setCapability("connectHardwareKeyboard", CONNECT_HARDWARE_KEYBOARD);

            URL remoteUrl = new URL(URL);

            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        }
        return driver;
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void tearDown() {
        if(null != driver) {
            driver.quit();
        }
    }

}
