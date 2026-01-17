package com.antonio.automation.tests;

import com.antonio.automation.base.BaseTest;
import com.antonio.automation.flows.LoginFlow;
import com.antonio.automation.models.User;
import com.antonio.automation.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest {

    private final LoginFlow loginFlow = new LoginFlow();

    @Test
    public void shouldAddItemToCart() {
        loginFlow.login(User.standardUser());

        InventoryPage inventoryPage = new InventoryPage();
        inventoryPage.addItem();

        Assert.assertEquals(inventoryPage.cartCount(), 1);
    }

    @Test
    public void shouldStartWithEmptyCart() {
        loginFlow.login(User.standardUser());

        InventoryPage inventoryPage = new InventoryPage();

        Assert.assertEquals(inventoryPage.cartCount(), 0);
    }
}