package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;
    private By pageTitle = By.className("title");
    private By continueButton = By.id("continue");
    private By firstInputField = By.id("first-name");
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public WebElement getPageTitle(){
        return driver.findElement(pageTitle);
    }
    }


