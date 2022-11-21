package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage{


    public ProductsPage(WebDriver driver) {

        super(driver);
    }


    public By cartButton = By.id("shopping_cart_container");

    public WebElement getCardButton(){
        return driver.findElement(cartButton);
    }


}

