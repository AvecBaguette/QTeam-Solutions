
package com.antonio.automation.core;

import io.appium.java_client.AppiumDriver;

public class DriverManager {
    private static final ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public static void setDriver(AppiumDriver d) { driver.set(d); }
    public static AppiumDriver getDriver() { return driver.get(); }
    public static void quit() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}