package com.juaracoding.test.authentications;

import com.juaracoding.test.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Hook {
    @BeforeSuite
    @Parameters({"url"})
    public static void initialize(String url) {
        System.out.println("com.juaracoding.test.authentications.Hook::initialize()");
        WebDriver driver = DriverSingleton.createOrGetDriver();
        driver.get(url);
    }

    @AfterSuite
    public static void finalTearDown() {
        System.out.println("com.juaracoding.test.authentications.Hook::finalTearDown()");
        DriverSingleton.quitDriver();
    }
}
