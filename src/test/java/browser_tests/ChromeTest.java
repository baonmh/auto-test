package browser_tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.TouchAction;

public class ChromeTest {

    public static void main(String[] args) throws InterruptedException {

        //Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "emulator");
        caps.setCapability("udid", "emulator-5554"); //Give Device ID of your mobile phone
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.1");
//      caps.setCapability("fullReset", false);
//      caps.setCapability("noReset", true);
        //Set ChromeDriver location
        System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");

        //Instantiate Appium Driver
        AppiumDriver<MobileElement> driver = null;
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.runAppInBackground(Duration.ofSeconds(-1));
            Thread.sleep(1000);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

        TouchByXPath(driver, "//android.widget.TextView[@content-desc=\"Chrome\"]");
        TouchByID(driver, "com.android.chrome:id/url_bar");
        ClearByID(driver, "com.android.chrome:id/url_bar");
        SendStrkeysById(driver, "com.android.chrome:id/url_bar", "http://demo.guru99.com/v4");
        TouchByXPath(driver, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]");

        driver.quit();
    }

    public static void TouchByXPath(AppiumDriver<MobileElement> driver, String EleByXPath) throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        action.tap(new TapOptions().withElement(new ElementOption().withElement(driver.findElementByXPath(EleByXPath)))).perform();
    }

    public static void TouchByID(AppiumDriver<MobileElement> driver, String EleById) throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        action.tap(new TapOptions().withElement(new ElementOption().withElement(driver.findElementById(EleById)))).perform();
    }

    public static void SendStrkeysById(AppiumDriver<MobileElement> driver, String EleById, String strKeys) throws InterruptedException {
        MobileElement element = (MobileElement) driver.findElementById(EleById);
        element.sendKeys(strKeys);
    }

    public static void ClearByID(AppiumDriver<MobileElement> driver, String EleById) {
        MobileElement element = (MobileElement) driver.findElementById(EleById);
        element.clear();
    }
}
