package com.juaracoding.test.Inventories;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.juaracoding.test.DriverSingleton;

public class InventoryListTest {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = DriverSingleton.createOrGetDriver();
    }

    @Test
    public void getAllElementTitleTest() {
        List<WebElement> collectionOfTitle = driver.findElements(By.className("inventory_item_name"));
        System.out.println(collectionOfTitle.size());
        Assert.assertTrue(collectionOfTitle.size() > 0);
    }
}
