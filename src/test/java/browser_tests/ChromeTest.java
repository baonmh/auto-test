package browser_tests;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.TouchAction;

public class ChromeTest {

    public static void main(String[] args) {

        //Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "emulator");
        caps.setCapability("udid", "emulator-5554"); //Give Device ID of your mobile phone
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
//        caps.setCapability("fullReset", false);
//        caps.setCapability("noReset", true);
        //Set ChromeDriver location
        System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");

        //Instantiate Appium Driver
        AppiumDriver<MobileElement> driver = null;
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

            TouchAction action = new TouchAction(driver);
            action.tap(new TapOptions().withElement(new ElementOption().withElement(driver.findElementByXPath("\t\n" +
                    "//android.widget.TextView[@content-desc=\"Chrome\"]")))).perform();
            driver.quit();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
}
