
package com.antonio.automation.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class DriverFactory {
    public static AppiumDriver create() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("platformName", "Android");
            caps.setCapability("browserName", "Chrome");
            caps.setCapability("appium:automationName", "UiAutomator2");
            caps.setCapability("appium:deviceName", "Android Emulator");
            caps.setCapability("appium:chromedriverAutodownload", true);
            caps.setCapability("appium:newCommandTimeout", 300);
            return new AndroidDriver(new URL("http://localhost:4723"), caps);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
