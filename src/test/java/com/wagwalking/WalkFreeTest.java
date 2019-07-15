package com.wagwalking;

import com.wagwalking.page.BasePage;
import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Test;

public class WalkFreeTest extends BaseTest {


    private HomePage homePage;
    private PromotionWalkFreePage promotionalPade;

    @Test
    public void testWalkFree() {
        homePage = new HomePage(driver);
        promotionalPade = homePage.clickWalkFreeButton();


        promotionalPade.inputEmail("a@gmail.com");
        promotionalPade.inputPassword("qwerty");
        promotionalPade.inputFirstName("firstName");
        promotionalPade.inputLastName("lastName");
        promotionalPade.inputPhone("phone");



    }
























}
