package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PromotionWalkFreePage extends BasePage{


    public PromotionWalkFreePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "input[type=\"email\"]")
    private WebElement emailField;

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }


    @FindBy(css = "input[type=\"password\"]")
    private WebElement passwordField;

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }



    @FindBy(css = "input[name=firstName]")
    WebElement firstNameField;

    public void inputFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }


    @FindBy(css = "input[name=lastName]" )
    private WebElement lastNameField;

    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    @FindBy(css = "input[name=phone]")
    private WebElement phoneField;



    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement requiredEmailField;

    @FindBy(css ="sc-bdVaJa sc-iwsKbI kOShw")
    private WebElement requiredFirstNameField;


    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement requiredLastNameField;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement requiredPhoneField;






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

    public void clickFirstNameField() {
        firstNameField.click();
    }

    public void  clickLastNameField() {
        lastNameField.click();
    }
    public void clickPhoneField() {
        phoneField.click();
    }



    public String getRequiredEmailNote() {
        return requiredEmailField.getText();
    }

    public String getRequiredFirstNameNote() {
        return requiredFirstNameField.getText();
    }

    public String getRequiredLastNameNote() {
        return requiredLastNameField.getText();
    }

    public String getRequiredPhoneNote() {
        return requiredPhoneField.getText();
    }


















}
