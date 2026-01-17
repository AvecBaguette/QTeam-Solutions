package com.antonio.automation.pages;

import org.openqa.selenium.By;

public class InventoryPage extends BasePage {

    private final By firstAdd  = By.cssSelector(".inventory_item button");
    private final By cart      = By.cssSelector(".shopping_cart_link");
    private final By cartBadge = By.cssSelector(".shopping_cart_badge");

    public void addItem() {
        click(firstAdd);
    }

    public void openCart() {
        click(cart);
    }

    public int cartCount() {
        return visible(cartBadge)
                ? Integer.parseInt(text(cartBadge))
                : 0;
    }

    public boolean loaded() {
        return visible(firstAdd);
    }
}