package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CardPage extends BasePage{

    WebDriver parluks;
    public CardPage (WebDriver parluks) {
        super(parluks);
    }

    private By checkoutButton = By.id("checkout");

    public WebElement getCheckoutButton(){
        return parluks.findElement(checkoutButton);
    }


    private By pageTitle = By.className("title");
    public WebElement getpageTitle(){
        return parluks.findElement(pageTitle);
    }


}
