package ui_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cart_badge_test {

    public static void main(String[] args) {

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        // Add Sauce Labs Backpack
        driver.findElement(
                By.id("add-to-cart-sauce-labs-backpack"))
              .click();

        // Add Sauce Labs Bike Light
        driver.findElement(
                By.id("add-to-cart-sauce-labs-bike-light"))
              .click();

        // Get cart badge count
        String cartCount = driver.findElement(
                By.className("shopping_cart_badge"))
                .getText();

        // Verify cart badge count
        if (cartCount.equals("2")) {
            System.out.println("TC_CART_002 : PASS");
            System.out.println("Cart badge displayed 2");
        } else {
            System.out.println("TC_CART_002 : FAIL");
            System.out.println("Expected: 2");
            System.out.println("Actual: " + cartCount);
        }

        // Close browser
        driver.quit();
    }
}