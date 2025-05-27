package com.juaracoding.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By heading = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeding() {
        return driver.findElement(heading).getText();
    }

}
