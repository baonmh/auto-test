package browser_tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

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
//        caps.setCapability("useJSONSource", "true");
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

        // Goto Guru
        MobileElement el0101 = (MobileElement) driver.findElementByAccessibilityId("Chrome");
        el0101.click();
        Thread.sleep(1000);
        MobileElement el0102 = (MobileElement) driver.findElementById("com.android.chrome:id/url_bar");
        el0102.click();
        Thread.sleep(1000);
        el0102.clear();
        Thread.sleep(1000);
        el0102.sendKeys("demo.guru99.com/v4");
        MobileElement el0103 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]");
        el0103.click();
        //Login
        Thread.sleep(3000);
        MobileElement el0201 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[25]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText");
        el0201.sendKeys("mngr267688");
        Thread.sleep(1000);
        MobileElement el0202 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[25]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText");
        el0202.sendKeys("Ugenyhe");
        Thread.sleep(2000);
        MobileElement el0203 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[25]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button[1]");
        el0203.click();
        //FillCustomer
        Thread.sleep(3000);
        MobileElement el0301 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.widget.ListView/android.view.View[2]/android.view.View");
        el0301.click();
        Thread.sleep(1000);
        MobileElement el0302 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText");
        el0302.click();
        Thread.sleep(1000);
        el0302.sendKeys("Baro New Customer");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(5000);

        MobileElement el0310 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[10]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]");
        el0310.click();
        Thread.sleep(1000);
        MobileElement el0311 = (MobileElement) driver.findElementByAccessibilityId("26 June 2020");
        el0311.click();
        Thread.sleep(1000);
        MobileElement el0312 = (MobileElement) driver.findElementById("android:id/button1");
        el0312.click();
        Thread.sleep(3000);

        MobileElement el0303 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[10]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View[2]/android.widget.EditText");
        el0303.click();
        Thread.sleep(1000);
        el0303.sendKeys("1100 Truong Sa");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(30000);

        MobileElement el03041 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[9]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View[1]");
        el03041.click();
        Thread.sleep(30000);

        MobileElement el0304 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[9]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View[2]/android.widget.EditText");
        el0304.click();
        Thread.sleep(1000);
        el0304.sendKeys("Ho Chi Minh");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(15000);

        MobileElement el0305 = (MobileElement) driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[8]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View[2]/android.widget.EditText");
        el0305.click();
        Thread.sleep(1000);
        el0305.sendKeys("Ho Chi Minh");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(3000);

        MobileElement el0306 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.EditText");
        el0306.click();
        Thread.sleep(1000);
        el0306.sendKeys("112233");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(2000);

        MobileElement el0307 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View[2]/android.widget.EditText");
        el0307.click();
        Thread.sleep(1000);
        el0307.sendKeys("0777528528");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(2000);

        MobileElement el0308 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View[2]/android.widget.EditText");
        el0308.click();
        Thread.sleep(1000);
        el0308.sendKeys("barotest3@gmail.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(2000);

        MobileElement el0309 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View[2]/android.widget.EditText");
        el0309.click();
        Thread.sleep(1000);
        el0309.sendKeys("123456789");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(5000);

        MobileElement el0313 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View[2]/android.widget.Button[1]");
        el0313.click();
        ///
        Thread.sleep(3000);
        //Verify Customer
        String customerID;
        MobileElement el0314 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.widget.GridView/android.view.View[4]/android.view.View[2]");
        customerID = el0314.getText();
        Assert.assertNotNull(customerID);
        System.out.println("Verified Create Customer Flow! CustomerID: " + customerID);

        // Fill Account

//        Thread.sleep(4000);
//        MobileElement el0400 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.widget.ListView/android.view.View[5]/android.view.View");
//        el0400.click();
//        Thread.sleep(2000);
//
//        MobileElement el0401 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText");
//        el0401.click();
//        Thread.sleep(1000);
//        el0401.sendKeys("63097");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//
//        MobileElement el0402 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[10]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.EditText");
//        el0402.click();
//        Thread.sleep(1000);
//        el0402.sendKeys("100000");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(10000);
//
//        MobileElement el0403 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[8]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[1]");
//        el0403.click();
//        Thread.sleep(3000);
//        MobileElement el0404 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[8]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View[2]/android.widget.Button[1]");
//        el0404.click();
//        Thread.sleep(3000);
//        // Verify New Account
//        String accountID;
//        MobileElement el0405 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.widget.GridView/android.view.View[4]/android.view.View[2]");
//        accountID = el0405.getText();
//        Assert.assertNotNull(accountID);
//        System.out.println("Verified Create Account Flow! AccountID: " + accountID);

        // Fill Deposit

//        Thread.sleep(4000);
//        MobileElement el0501 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.widget.ListView/android.view.View[8]/android.view.View");
//        el0501.click();
//        Thread.sleep(4000);
//
//        MobileElement el0502 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[11]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.EditText");
//        el0502.click();
//        Thread.sleep(1000);
//        el0502.sendKeys("80796");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//
//        MobileElement el0503 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[10]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.widget.EditText");
//        el0503.click();
//        Thread.sleep(1000);
//        el0503.sendKeys("50000");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//
//        MobileElement el0504 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[10]/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.widget.EditText\n");
//        el0504.click();
//        Thread.sleep(1000);
//        el0504.sendKeys("Just Deposit");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(20000);
//
//        MobileElement el0505 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[8]/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View[1]");
//        el0505.click();
//        Thread.sleep(20000);
//
//        MobileElement el0506 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[8]/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]/android.view.View[2]/android.widget.Button[1]");
//        el0506.click();
//        Thread.sleep(3000);
//
//        String transaction;
//        MobileElement el0507 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[12]/android.view.View/android.view.View/android.widget.GridView/android.view.View[1]/android.view.View/android.view.View");
//        transaction = el0507.getText();
//        Assert.assertNotNull(transaction);
//        System.out.println("Verified! " + transaction);

        //Quit driver
    }

    public static void TouchByXPath(AppiumDriver<MobileElement> driver, String EleByXPath) throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        action.tap(new TapOptions().withElement(new ElementOption().withElement(driver.findElementByXPath(EleByXPath)))).perform();
        Thread.sleep(1000);
    }

}
