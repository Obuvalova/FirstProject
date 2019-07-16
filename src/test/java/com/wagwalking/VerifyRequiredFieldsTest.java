package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;

public class VerifyRequiredFieldsTest extends BaseTest {



    private HomePage homePage;
    private PromotionWalkFreePage promotionPage;

    @Test
    public void testVerifyRequiredFieldsTest() {

        homePage = new HomePage(driver);

       promotionPage = homePage.clickWalkFreeButton();

       promotionPage.clickEmailField();

       promotionPage.clickPasswordField();

       promotionPage.clickFirstNameField();

       promotionPage.clickLastNameField();

       promotionPage.clickPhoneField();



       String emailNote = promotionPage.getRequiredEmailNote();

        System.out.println(emailNote);

        Assert.assertEquals("required",emailNote);




        String firstNameNote = promotionPage.getRequiredFirstNameNote();

        System.out.println(firstNameNote);

        Assert.assertEquals("required",firstNameNote);



        String lastNameNote = promotionPage.getRequiredLastNameNote();

        Assert.assertEquals("required",lastNameNote);



        String phoneNote = promotionPage.getRequiredPhoneNote();
        Assert.assertEquals("required",phoneNote);




    }















}
