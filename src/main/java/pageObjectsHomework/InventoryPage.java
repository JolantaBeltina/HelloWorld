package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    WebDriver parluks;

    public InventoryPage(WebDriver parluks) {

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

    public By addToCartBackpackButton = By.id("add-to-cart-sauce-labs-backpack");
    public WebElement getAddToCartBackpackButton() { return parluks.findElement(addToCartBackpackButton);}


}




