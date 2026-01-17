package com.antonio.automation.flows;

import com.antonio.automation.models.User;
import com.antonio.automation.pages.LoginPage;

public class LoginFlow {

    private final LoginPage loginPage = new LoginPage();

    public void login(User user) {
        loginPage.loginWithCredentials(
                user.username(),
                user.password()
        );
    }
}