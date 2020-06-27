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
        caps.setCapability("simpleIsVisibleCheck", "true");
        caps.setCapability("useJSONSource", "true");
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
//            driver.runAppInBackground(Duration.ofSeconds(-1));
//            Thread.sleep(1000);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

        // Goto Guru
//        MobileElement el0101 = (MobileElement) driver.findElementByAccessibilityId("Chrome");
//        el0101.click();
//        Thread.sleep(1000);
//        MobileElement el0102 = (MobileElement) driver.findElementById("com.android.chrome:id/url_bar");
//        el0102.click();
//        Thread.sleep(1000);
//        el0102.clear();
//        Thread.sleep(1000);
//        el0102.sendKeys("demo.guru99.com/v4");
//        MobileElement el0103 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]");
//        el0103.click();
//      //Login
//        Thread.sleep(3000);
//        MobileElement el0201 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[25]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText");
//        el0201.sendKeys("mngr267688");
//        Thread.sleep(1000);
//        MobileElement el0202 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[25]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText");
//        el0202.sendKeys("Ugenyhe");
//        Thread.sleep(2000);
//        MobileElement el0203 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[25]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button[1]");
//        el0203.click();
        //
//        Thread.sleep(3000);
//        MobileElement el0301 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.widget.ListView/android.view.View[2]/android.view.View");
//        el0301.click();
//        Thread.sleep(1000);
//        MobileElement el0302 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText");
//        el0302.sendKeys("Baro New Customer");
//        Thread.sleep(1000);
//        MobileElement el0303 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View[2]/android.widget.EditText");
//        el0303.sendKeys("1100 Truong Sa");
//        Thread.sleep(1000);
//        MobileElement el0304 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View[2]/android.widget.EditText");
//        el0304.sendKeys("Ho Chi Minh");
//        Thread.sleep(1000);
//        MobileElement el0305 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View[2]/android.widget.EditText");
//        el0305.sendKeys("No State");
//        Thread.sleep(1000);
//        MobileElement el0306 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View[2]/android.widget.EditText");
//        el0306.sendKeys("112233");
//        Thread.sleep(1000);
//        MobileElement el0307 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[9]/android.view.View[2]/android.widget.EditText");
//        el0307.sendKeys("0777528528");
//        Thread.sleep(1000);
//        MobileElement el0308 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[10]/android.view.View[2]/android.widget.EditText");
//        el0308.sendKeys("baronewcus@gmail.com");
//        Thread.sleep(1000);
//        MobileElement el0309 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[11]/android.view.View[2]/android.widget.EditText");
//        el0309.sendKeys("123456789");
//        Thread.sleep(1000);
        MobileElement el0310 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]");
        el0310.click();
        MobileElement el0310 = (MobileElement) driver.findElementById("android:id/month_view");

        TouchAction action = new TouchAction(driver);
        TouchAction().press(100,100).moveTo(200,200).release();

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
