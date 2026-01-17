package com.antonio.automation.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By usernameInput = By.cssSelector("[data-test='username']");
    private final By passwordInput = By.cssSelector("[data-test='password']");
    private final By loginButton   = By.cssSelector("[data-test='login-button']");
    private final By errorMessage  = By.cssSelector("[data-test='error']");

    public void loginWithCredentials(String username, String password) {
        type(usernameInput, username);
        type(passwordInput, password);
        click(loginButton);
    }

    public String getErrorMessage() {
        return text(errorMessage);
    }
}