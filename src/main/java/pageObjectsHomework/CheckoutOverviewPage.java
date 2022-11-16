package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {
    WebDriver parluks;

    public CheckoutOverviewPage(WebDriver parluks) {

        this.parluks = parluks;
    }

    public By finishButton = By.id("finish");
    public WebElement getFinishButton(){return parluks.findElement(finishButton);}

    public By checkoutCompleteContainer = By.id("checkout_complete_container");
    public WebElement getCheckoutCompleteContainer(){return parluks.findElement(checkoutCompleteContainer);}

    public By backHomeButton = By.id("back-to-products");
    public WebElement getBackHomeButton(){return parluks.findElement(backHomeButton);}
}
