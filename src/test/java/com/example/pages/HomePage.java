package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
   public String baseUrl = ApplicationProperties.INSTANCE.getUrl();

   @FindBy(name = "q")
    private WebElement searchBox;

   @FindBy(name = "btnK")
    private WebElement googleSearchButton;

   public HomePage(WebDriver driver){
       super(driver);
       PageFactory.initElements(driver,this);
   }

   public void searchPage() {
       driver.manage().window().maximize();
       driver.get(baseUrl);
       searchBox.sendKeys("youtube");
       waitForElementToBeClickable(driver,googleSearchButton);
       googleSearchButton.click();

   }

}
