package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    WebDriver parluks;

    public ProductsPage(WebDriver parluks) {

        this.parluks = parluks;
    }
    private By pageTitle = By.cssSelector("span.title");

    public WebElement getPageTitle (){
        return parluks.findElement(pageTitle);

    }

    public By cartButton = By.id("shopping_cart_container");

    public WebElement getCardButton(){
        return parluks.findElement(cartButton);
    }


}

