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

       promotionPage.clickPasswordField();





        String emailNote = promotionPage.getEmailRequiredFields();

        Assert.assertEquals("required",emailNote);




        String firstNameNote = promotionPage.getFirstNameRequiredFields();

        Assert.assertEquals("required",firstNameNote);



        String lastNameNote = promotionPage.getLastNameRequiredFields();

        Assert.assertEquals("required",lastNameNote);



        String phoneNote = promotionPage.getPhoneRequiredFields();
        Assert.assertEquals("required",phoneNote);


        String character = promotionPage.getCharacters();
        Assert.assertEquals("(8 Characters,",character);

        String letter = promotionPage.getLetter();
        Assert.assertEquals("1 Letter,",letter);

        String number = promotionPage.getNumber();
        Assert.assertEquals("1 Number)",number);




    }















}
