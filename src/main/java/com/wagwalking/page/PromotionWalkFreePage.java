package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PromotionWalkFreePage extends BasePage{


    public PromotionWalkFreePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "input[type=\"email\"]")
    WebElement emailField;

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }


    @FindBy(css = "input[type=\"password\"]")
    WebElement passwordField;

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }



    @FindBy(css = "input[name=firstName]")
    WebElement firstNameField;

    public void inputFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }


    @FindBy(css = "input[name=lastName]" )
    WebElement lastNameField;

    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    @FindBy(css = "input[name=phone]")
    WebElement phoneField;



    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement requiredElementField;






    public void inputPhone(String phone)
    {
        phoneField.sendKeys(phone);
    }


    public void clickEmailField() {
        emailField.click();
    }

    public void clickPasswordField() {
        passwordField.click();
    }

    public String getRequiredEmailNote() {
        return requiredElementField.getText();
    }


















}
