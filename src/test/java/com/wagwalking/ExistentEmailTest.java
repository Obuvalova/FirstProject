package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;

public class ExistentEmailTest extends BaseTest {

    private HomePage homePage;
    private PromotionWalkFreePage promotionPage;

    @Test
    public void testExistenEmailTest() {
        homePage = new HomePage(driver);
        promotionPage = homePage.clickWalkFreeButton();













    }




















}
