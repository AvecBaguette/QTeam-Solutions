package com.antonio.automation.tests;

import com.antonio.automation.base.BaseTest;
import com.antonio.automation.flows.LoginFlow;
import com.antonio.automation.models.User;
import com.antonio.automation.pages.InventoryPage;
import com.antonio.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    private final LoginFlow loginFlow = new LoginFlow();

    @Test
    public void shouldLoginSuccessfullyWithValidUser() {
        loginFlow.login(User.standardUser());

        Assert.assertTrue(
                new InventoryPage().loaded(),
                "Inventory page should be displayed after successful login"
        );
    }

    @Test
    public void shouldShowErrorForLockedUser() {
        loginFlow.login(User.lockedUser());

        Assert.assertTrue(
                new LoginPage().getErrorMessage().contains("locked"),
                "Locked user error message should be displayed"
        );
    }
}