package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver parluks;

    public CheckoutPage (WebDriver parluks) {

        this.parluks = parluks;
    }

    public By checkoutButton = By.id("checkout");
    public WebElement getCheckoutButton(){return parluks.findElement(checkoutButton);}
}
