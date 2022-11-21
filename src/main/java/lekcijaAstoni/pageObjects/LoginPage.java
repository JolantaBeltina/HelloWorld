package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    // definesim privatus lokatorus

    private By usernameInputField = By.id("user-name");
    private By passwordInputField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorTextField = By.cssSelector("div.error-message-container h3");

    public void login (String username, String password){
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }
    public String getErrorText (){
       return driver.findElement(errorTextField).getText();
    }
    public WebElement getUsernameField (){
        return  driver.findElement(usernameInputField);
    }
    public WebElement getPasswordField (){
        return driver.findElement(passwordInputField);
    }
    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }



    // lai atrastu elementu mums vajag draiverri (pārlūku)



    public LoginPage(WebDriver driver) {
      super (driver);



    }
}
