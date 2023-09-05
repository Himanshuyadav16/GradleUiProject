package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public WebDriver driver;

    Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @BeforeSuite()
    public void beforeSuite() {
        logger.info("Test Suite Started");
    }

    @AfterSuite()
    public void afterSuite() {
        logger.info("Test Suite Completed");
    }

    public WebDriver getWebDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        driver = new ChromeDriver(options);
        return driver;
    }
}
