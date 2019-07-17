package com.wagwalking;

import com.wagwalking.page.BecomeWalkerPage;
import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;

public class BecomeWalckerRequiredFieldTest extends BaseTest {

    private HomePage homePage;
    private PromotionWalkFreePage promotionPage;
    private BecomeWalkerPage becomeWalkerPage;

    @Test
    public void BecomeWalckerRequiredFieldTest() {

        homePage = new HomePage(driver);

        becomeWalkerPage = homePage.clickBecomeWalkerButton();


        String firstName = becomeWalkerPage.getRequiredFirstName();
        Assert.assertEquals("FirstName cannot be blank","firstName");

        String LastName = becomeWalkerPage.getRequiredLastName();
        Assert.assertEquals("lastName cannot be blank","lastName");

        String Email = becomeWalkerPage.getRequiredEmail();
        Assert.assertEquals("email cannot be Blank","email");

        String PhoneNumber = becomeWalkerPage.getRequiredPhonNumber();
        Assert.assertEquals("phoneNumber cannot be blank","phoneNumber");

















    }















}
