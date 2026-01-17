package com.antonio.automation.pages;

import org.openqa.selenium.By;

public class CheckoutCompletePage extends BasePage {

    private final By completionHeader =
            By.cssSelector("[data-test='complete-header']");

    public boolean completed() {
        return visible(completionHeader);
    }
}