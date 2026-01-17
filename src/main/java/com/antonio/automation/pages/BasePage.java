package com.antonio.automation.pages;

import com.antonio.automation.core.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriverWait getWait() {
        return new WebDriverWait(
                DriverManager.getDriver(),
                15
        );
    }

    protected void click(By locator) {
        getWait()
                .until(ExpectedConditions.elementToBeClickable(locator))
                .click();
    }

    protected void type(By locator, String text) {
        WebElement el = getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        el.clear();
        el.sendKeys(text);
    }

    protected String text(By locator) {
        return getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(locator))
                .getText();
    }

    protected boolean visible(By locator) {
        try {
            getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}