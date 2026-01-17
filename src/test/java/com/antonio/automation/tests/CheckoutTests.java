package com.antonio.automation.tests;

import com.antonio.automation.base.BaseTest;
import com.antonio.automation.flows.CheckoutFlow;
import com.antonio.automation.flows.LoginFlow;
import com.antonio.automation.models.User;
import com.antonio.automation.pages.CartPage;
import com.antonio.automation.pages.CheckoutCompletePage;
import com.antonio.automation.pages.CheckoutInfoPage;
import com.antonio.automation.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTests extends BaseTest {

    private final LoginFlow loginFlow = new LoginFlow();
    private final CheckoutFlow checkoutFlow = new CheckoutFlow();

    @Test
    public void shouldCompleteCheckoutSuccessfully() {
        User user = User.standardUser();

        loginFlow.login(user);
        checkoutFlow.completeCheckoutFromInventory(user);

        Assert.assertTrue(
                new CheckoutCompletePage().completed(),
                "Order completion page should be displayed"
        );
    }

    @Test
    public void shouldShowErrorWhenCheckoutInformationIsMissing() {
        User user = User.standardUser();

        loginFlow.login(user);
        InventoryPage inventoryPage = new InventoryPage();
        inventoryPage.addItem();
        inventoryPage.openCart();

        new CartPage().checkout();
        CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage();
        checkoutInfoPage.cont();

        Assert.assertTrue(
                checkoutInfoPage.error().length() > 0,
                "Validation error should be displayed when mandatory fields are missing"
        );
    }
}