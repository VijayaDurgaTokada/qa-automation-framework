package com.vijaya.qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest {

    private WebDriverWait wait;

    private void login() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("[data-test='title']")));
    }

    @Test
    public void addToCartShowsBadge() {
        login();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        WebElement badge = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("[data-test='shopping-cart-badge']")));
        Assert.assertEquals(badge.getText(), "1");
    }

    @Test
    public void removeFromCartClearsBadge() {
        login();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("[data-test='shopping-cart-badge']")));

        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        boolean badgeGone = wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector("[data-test='shopping-cart-badge']")));
        Assert.assertTrue(badgeGone);
    }
}