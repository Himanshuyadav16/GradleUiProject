package com.example.testClasses;

import com.example.BaseTest;
import com.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void SamplePage()  {
        WebDriver driver = getWebDriver();
        HomePage homePage = new HomePage(driver);
        homePage.searchPage();
        driver.close();
        driver.quit();
    }
}
