package com.wagwalking;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    protected User user;
    protected User2 user2;
    protected User3 user3;



    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://wagwalking.com/");
        System.out.println("Start");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";
        Assert.assertEquals(expectedTitle, actualTitle);
        user = new User("a@gmail.com","Peter","ivanov","qwerty1","(123)456-7899");
        user2 = new User2("b@gmail.com","Ivan","Petrov","asdfg","(123)123-1234");
        user3 = new User3("c@gmail.com","Fedor","Gudkov","zxcvb","(123)234-4567");





    }

    @After
    public void quit() {
        System.out.println("Finish");
        //driver.quit();

    }

    //i added some new code














}
