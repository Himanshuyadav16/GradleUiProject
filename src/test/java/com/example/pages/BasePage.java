package com.example.pages;

import com.example.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BasePage  extends BaseTest {
    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }
 public void waitForElementToBeClickable(WebDriver driver, WebElement element){
      WebDriverWait wait =new WebDriverWait(driver, 30);
     wait.until(ExpectedConditions.elementToBeClickable(element));
 }

}