package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {


    private By continueButton = By.id("continue");
    private By firstInputField = By.id("first-name");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }


}

