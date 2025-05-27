package com.juaracoding.test.authentications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.juaracoding.test.DriverSingleton;

public class SignInWithoutPasswordTest {
    WebDriver driver;
    WebElement usernameField;
    WebElement buttonLogin;

    @BeforeClass
    public void setup() throws InterruptedException {
        driver = DriverSingleton.createOrGetDriver();
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testStep01() {
        usernameField = driver.findElement(By.id("user-name"));
        buttonLogin = driver.findElement(By.id("login-button"));
    }

    @Test
    public void testStep02() throws InterruptedException {
        Thread.sleep(3000);
        usernameField.sendKeys("standard_user");
        buttonLogin.click();
        usernameField.clear();
        Thread.sleep(3000);
    }
}
