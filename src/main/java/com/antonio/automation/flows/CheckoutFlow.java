package com.antonio.automation.flows;

import com.antonio.automation.models.User;
import com.antonio.automation.pages.CartPage;
import com.antonio.automation.pages.CheckoutInfoPage;
import com.antonio.automation.pages.CheckoutOverviewPage;
import com.antonio.automation.pages.InventoryPage;

public class CheckoutFlow {

    private final InventoryPage inventoryPage = new InventoryPage();
    private final CartPage cartPage = new CartPage();
    private final CheckoutInfoPage infoPage = new CheckoutInfoPage();
    private final CheckoutOverviewPage overviewPage = new CheckoutOverviewPage();

    public void completeCheckoutFromInventory(User user) {
        inventoryPage.addItem();
        inventoryPage.openCart();

        cartPage.checkout();

        infoPage.fill(
                user.firstName(),
                user.lastName(),
                user.postalCode()
        );
        infoPage.cont();

        overviewPage.finish();
    }
}