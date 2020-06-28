### First thing first
Read Assignment PDF and Guiding images

Go to link: `http://demo.guru99.com/v4/`

Work around to get the flow, fields and validation

Try a happy case with Valid data from HomePage to Deposit on PC Browser

### Installation
Install Maven (I have always used Gradle)

Install Appium

Update Java JDK

Install Android SDK

Init Git and Push Origin Project

Read Appium syntax

Read tutorial and document of Appium page: `http://appium.io/tutorial.html`

Search simple example from Medium, Viblo and Youtube

### Common Troubleshooting
Fix some common issues of Windows env and installed tools above
+ PATH issue => Config system env PATH
+ Java old version issue => update
+ Android SDK need high version to run => update
+ Run on new devices issue: Security exception: adb clearing user data is forbidden
            ```=> Allow USB debugging and stop clear user data```
            
+ Try to use setCapability Browser but not work 
            ```=> Chrome not reachable
            => No Chromedriver found that can automate Chrome '83.0.4103' 
                => downloaded and config binary path for Chrome 83.0.4103 + install chrome 83.0.4103 for Emulator
                => Not work```
+ Run on new devices issue: clearing user data is forbidden => skip => Run on Emulator
            ```=> It seems Chrome try to clear data, setCapability is meanless
            => Seems there are 2 configs for USB Debugging (for some devices) but my OPPO has only 1```

Install Android Studio + Set up and run Emulator
+ PATH issue for Android tools / platform tools

### Start Coding
Use `Uiautomatorviewer` of Android SDK tools to inspect element

Use Touch Action and WebElement Sendkeys to do a flow from Emulator first Screen to Chrome and then Guru Page

Issue slow loading for XPath, may stops the process
```
=> Try to use other locators
=> Try to increase waiting time
```

Found the `New Session of Appium` while reading Appium guide and some threads on forums
```
=> Change all the code into JUnit and WebElement Click + Sendkeys
```

Try the happy case with JUnit code from `Appium New Session`

Coding with brute-force first

Issue slow loading for XPath, may stops the process, especially when there is screen movement
```
=> Fail to try to use other locators because only XPATH is shown
=> Cannot get the Unique locators from development team
=> Try to increase waiting time
```
### Improvements and Otimizations:
+ Improve process time with wait and waitTillVisible
+ Create functions for Click and Sendkeys, with input are: (driver + element + waiting time)
+ Wrap functions to another java file, put them in another Folder
+ Wrap list of actions to Steps, put them in another Folder
+ Wrap list of Steps to Test Case, put them in another Folder
+ Run only Test Cases in main Java
+ Get results from running main and print out
+ Optional: Report Form








