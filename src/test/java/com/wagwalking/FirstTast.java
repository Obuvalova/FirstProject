package com.wagwalking;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FirstTast extends BaseTest{



    @Test 
    public void testFirst() {

        WebElement walkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));
        walkFreeButton.click();


        WebElement emailField = driver.findElement(By.cssSelector("input[type=\"email\"]"));
        emailField.sendKeys(user.getEmail());


        WebElement password = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        password.sendKeys(user.getPassword());


        WebElement firstName = driver.findElement(By.cssSelector("input[name=firstName]"));
        firstName.sendKeys(user.getFirstName());




        WebElement lastName = driver.findElement(By.cssSelector("input[name=lastName]"));
        lastName.sendKeys(user.getLastName());



        WebElement phone = driver.findElement(By.cssSelector("input[name=phone]"));
        phone.sendKeys(user.getPhone());

    }



























}
