package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BecomeWalkerPage extends BasePage {


    public BecomeWalkerPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".button-text")
    private WebElement applyButton;



    public void clickApplyButton() {
        applyButton.click();
    }
    @FindBy(css = ".error-message")
    private List<WebElement> requiredFiels;

    //[0]firstName
    //[1]lastName
    //[2]email
    //[3]phone number

    public String getRequiredFirstName() {
        return requiredFiels.get(0).getText();
    }
    public String getRequiredLastName() {
        return requiredFiels.get(1).getText();
    }
    public String getRequiredEmail() {
        return requiredFiels.get(2).getText();
    }
    public String getRequiredPhonNumber() {
        return requiredFiels.get(3).getText();
    }















}
