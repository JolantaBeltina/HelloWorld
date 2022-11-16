package lekcijaSeptini.labDarbs;

import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SouceDemoLoginTest extends BaseTest {

    @Test
  public void testLoginPageObjectExample (){
        LoginPage loginPage = new LoginPage(parluks);
       loginPage.login("kdfjdskjfk","fjfjdkfjd");
        loginPage.getLoginButton().click();
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any user in this service");

    }



    @Test
    public void testLoginWrongEmptyUsernameAndPassword()  {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("kdfjdskjfk","fjfjdkfjd");
        loginPage.getLoginButton().click();
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any user in this service");


    }
    @Test
    public void testLoginEmptyUsernameAndPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("","");
        loginPage.getLoginButton().click();
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any user in this service");

    }

    @Test
    public void testLoginEmptyUsername() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("","fjfjdkfjd");
        loginPage.getLoginButton().click();
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any user in this service");


    }
    @Test
    public void testLoginEmptyPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("kdfjdskjfk","");
        loginPage.getLoginButton().click();
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any user in this service");


    }


    // Products Page tests
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user","secret_sauce");
        ProductsPage produktulapa = new ProductsPage(parluks);
        wait.until(ExpectedConditions.visibilityOf(produktulapa.getPageTitle()));
        Assert.assertEquals(produktulapa.getPageTitle().getText(),"PRODUCTS");
    }




    private void testLogin (String username, String password, String exeptedErrorMessage){
        WebElement lietotajaVardsIevadeslauks = parluks.findElement(By.id("user_name"));
        lietotajaVardsIevadeslauks.sendKeys(username);

        WebElement lietotajaParolesIevadeslauks = parluks.findElement(By.id("password"));
        lietotajaParolesIevadeslauks.sendKeys(password);

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));
        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText,exeptedErrorMessage);


    }



}
