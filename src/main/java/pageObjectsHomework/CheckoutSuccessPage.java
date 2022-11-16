package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSuccessPage {
    WebDriver parluks;

    public CheckoutSuccessPage(WebDriver parluks) {

        this.parluks = parluks;
    }

    public By firstNameButton = By.id("first-name");
    public WebElement getFirstNameButton(){ return parluks.findElement(firstNameButton);}
    public By lastNameButton = By.id("last-name");
    public WebElement getLastNameButton(){ return parluks.findElement(lastNameButton);}
    public By postalCodeButton = By.id("postal-code");
    public WebElement getPostalCodeButton(){return parluks.findElement(postalCodeButton);}

    public void login (String username, String lastname, String postalcode){
        getFirstNameButton().sendKeys(username);
        getLastNameButton().sendKeys(lastname);
        getPostalCodeButton().sendKeys(postalcode);
    }

    public By continueButton = By.id("continue");
    public WebElement getContinueButton(){return parluks.findElement(continueButton);}

}
