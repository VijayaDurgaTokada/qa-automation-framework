package com.vijaya.qa;

import java.beans.Transient;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vijaya.qa.BaseTest;

public class CheckoutTests extends BaseTest{

    private WebDriverWait wait;

    private void login(){
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector("[data-test='title']")));
    }

    @Test
    public void checkoutShowsConfirmation(){
        login();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector("[data-test='shopping-cart-link']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")))
                .sendKeys("Vijaya");
        driver.findElement(By.id("last-name")).sendKeys("Tokada");
        driver.findElement(By.id("postal-code")).sendKeys("72712");
        driver.findElement(By.id("continue")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("finish"))).click();

        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("[data-test='complete-header']")));
        Assert.assertEquals(header.getText(), "Thank you for your order!");

    }


}