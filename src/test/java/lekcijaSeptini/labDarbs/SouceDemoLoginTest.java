package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SouceDemoLoginTest extends BaseTest {


    @Test
    public void testLoginWrongEmptyUsernameAndPassword()  {
        testLogin("aaaaaaa","qwerty1234", "Epic sadface: Username and password do not match any user in this service\n");

    }
    @Test
    public void testLoginEmptyUsernameAndPassword() {
        testLogin("","", "Epic sadface: Username is required");
    }

    @Test
    public void testLoginEmptyUsername() {
        testLogin("","qwerty12345", "Epic sadface: Username is required");
    }
    @Test
    public void testLoginEmptyPassword() {
        testLogin("QWERTY","", "Epic sadface: Username is required");


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
