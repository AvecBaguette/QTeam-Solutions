package com.antonio.automation.pages;

import org.openqa.selenium.By;

public class CheckoutInfoPage extends BasePage {

    private final By firstNameInput = By.cssSelector("[data-test='firstName']");
    private final By lastNameInput  = By.cssSelector("[data-test='lastName']");
    private final By postalCodeInput = By.cssSelector("[data-test='postalCode']");
    private final By continueButton = By.cssSelector("[data-test='continue']");
    private final By errorMessage = By.cssSelector("[data-test='error']");

    public void fill(String firstName, String lastName, String postalCode) {
        type(firstNameInput, firstName);
        type(lastNameInput, lastName);
        type(postalCodeInput, postalCode);
    }

    public void cont() {
        click(continueButton);
    }

    public String error() {
        return text(errorMessage);
    }
}