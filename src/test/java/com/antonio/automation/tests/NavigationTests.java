package com.antonio.automation.tests;

import com.antonio.automation.base.BaseTest;
import com.antonio.automation.flows.LoginFlow;
import com.antonio.automation.models.User;
import com.antonio.automation.pages.CartPage;
import com.antonio.automation.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTest {

    private final LoginFlow loginFlow = new LoginFlow();

    @Test
    public void shouldNavigateBackToInventoryFromCart() {
        loginFlow.login(User.standardUser());

        InventoryPage inventoryPage = new InventoryPage();
        inventoryPage.addItem();
        inventoryPage.openCart();

        CartPage cartPage = new CartPage();
        cartPage.backToInventory();

        Assert.assertTrue(
                inventoryPage.loaded(),
                "Inventory page should be displayed after navigating back from cart"
        );
    }

    @Test
    public void shouldPersistCartBadgeAfterNavigation() {
        loginFlow.login(User.standardUser());

        InventoryPage inventoryPage = new InventoryPage();
        inventoryPage.addItem();
        inventoryPage.openCart();

        Assert.assertEquals(
                inventoryPage.cartCount(),
                1,
                "Cart badge count should persist after navigation"
        );
    }
}