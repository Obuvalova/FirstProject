package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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
    private WebElement firstNameField;

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
    private List<WebElement> requiredFields;

    @FindBy(css = ".sc-gzVnrw.fzplxK")
    private List<WebElement> requiredFields1;







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



    public String getEmailRequiredFields() {
        return requiredFields.get(0).getText();
    }
    public String getFirstNameRequiredFields() {
        return requiredFields.get(1).getText();
    }

    public String getLastNameRequiredFields() {
        return  requiredFields.get(2).getText();
    }

    public String getPhoneRequiredFields() {
        return requiredFields.get(3).getText();
    }


    public String getCharacters() {
        return requiredFields1.get(0).getText();
    }

    public String getLetter() {
        return requiredFields1.get(1).getText();
    }
    public String getNumber() {
        return requiredFields1.get(2).getText();
    }

























}
