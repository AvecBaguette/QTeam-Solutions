
package com.antonio.automation.base;

import com.antonio.automation.core.DriverFactory;
import com.antonio.automation.core.DriverManager;
import org.testng.annotations.*;

public abstract class BaseTest {
    @BeforeMethod
    public void setup() {
        DriverManager.setDriver(DriverFactory.create());
        DriverManager.getDriver().get("https://www.saucedemo.com");
    }
    @AfterMethod
    public void tearDown() {
        DriverManager.quit();
    }
}