package com.juaracoding.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static com.juaracoding.test.DriverSingleton.driver;

public class BrowserManager {
    public static WebDriver build() {
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);
//        options.addArguments("--start-maximized");
        driver.manage().window().maximize(); // Ini yang efektif untuk Firefox

        return new FirefoxDriver(options);
    }
}

//ChromeOptions options = new ChromeOptions();
//    options.addArguments("--start-maximized");
//
//    return new ChromeDriver(options);

