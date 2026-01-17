package com.antonio.automation.pages;

import org.openqa.selenium.By;

public class CheckoutOverviewPage extends BasePage {

    private final By finishButton = By.cssSelector("[data-test='finish']");

    public void finish() {
        click(finishButton);
    }
}