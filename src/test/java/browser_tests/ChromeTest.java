package browser_tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Date;

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

        Date date= new Date();
        long time = date.getTime();
        String userId = "mngr267688";
        String pwd = "Ugenyhe";

        //Instantiate Appium Driver
        AppiumDriver<MobileElement> driver = null;
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.runAppInBackground(Duration.ofSeconds(-1));
            Thread.sleep(1000);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

        //Go To Guru
        TouchByXPath(driver, "//android.widget.TextView[@content-desc=\"Chrome\"]");
        TouchByID(driver, "com.android.chrome:id/url_bar");
        ClearByID(driver, "com.android.chrome:id/url_bar");
        SendStrkeysById(driver, "com.android.chrome:id/url_bar", "http://demo.guru99.com/v4");
        TouchByXPath(driver, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]");
        //Login
        Thread.sleep(2000);

        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[25]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText");
        el1.sendKeys(userId);
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[25]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText");
        el2.sendKeys(pwd);
        Thread.sleep(2000);
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[25]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button[1]");
        el3.click();

        //Verify Create New Customer

        //Verify Create New Account

        //Verify Deposit


        driver.quit();
    }

    public static void TouchByXPath(AppiumDriver<MobileElement> driver, String EleByXPath) throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        action.tap(new TapOptions().withElement(new ElementOption().withElement(driver.findElementByXPath(EleByXPath)))).perform();
        Thread.sleep(1000);
    }

    public static void TouchByID(AppiumDriver<MobileElement> driver, String EleById) throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        action.tap(new TapOptions().withElement(new ElementOption().withElement(driver.findElementById(EleById)))).perform();
        Thread.sleep(1000);
    }

    public static void TouchByAccessId(AppiumDriver<MobileElement> driver, String EleByAccessId) throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        action.tap(new TapOptions().withElement(new ElementOption().withElement(driver.findElementByAccessibilityId(EleByAccessId)))).perform();
        Thread.sleep(1000);
    }

    public static void TouchByClass(AppiumDriver<MobileElement> driver, String EleByClass) throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        action.tap(new TapOptions().withElement(new ElementOption().withElement(driver.findElementByClassName(EleByClass)))).perform();
        Thread.sleep(1000);
    }

    public static void SendStrkeysById(AppiumDriver<MobileElement> driver, String EleById, String strKeys) throws InterruptedException {
        MobileElement element = (MobileElement) driver.findElementById(EleById);
        element.sendKeys(strKeys);
        Thread.sleep(1000);
    }

    public static void SendStrkeysByXPath(AppiumDriver<MobileElement> driver, String EleByXPath, String strKeys) throws InterruptedException {
        MobileElement element = (MobileElement) driver.findElementById(EleByXPath);
        element.sendKeys(strKeys);
        Thread.sleep(1000);
    }

    public static void SendStrkeysByClass(AppiumDriver<MobileElement> driver, String EleByClass, String strKeys) throws InterruptedException {
        MobileElement element = (MobileElement) driver.findElementByClassName(EleByClass);
        element.sendKeys(strKeys);
        Thread.sleep(1000);
    }

    public static void SendStrkeysAccessId(AppiumDriver<MobileElement> driver, String EleByAccessId, String strKeys) throws InterruptedException {
        MobileElement element = (MobileElement) driver.findElementByAccessibilityId(EleByAccessId);
        element.sendKeys(strKeys);
        Thread.sleep(1000);
    }

    public static void ClearByID(AppiumDriver<MobileElement> driver, String EleById) throws InterruptedException {
        MobileElement element = (MobileElement) driver.findElementById(EleById);
        element.clear();
        Thread.sleep(1000);
    }
}
