package com.antonio.automation.pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage {

    private final By checkoutButton =
            By.cssSelector("[data-test='checkout']");

    private final By continueShoppingButton =
            By.cssSelector("[data-test='continue-shopping']");

    public void checkout() {
        click(checkoutButton);
    }

    public void backToInventory() {
        click(continueShoppingButton);
    }
}