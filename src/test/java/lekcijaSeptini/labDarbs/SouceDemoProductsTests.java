package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SouceDemoProductsTests extends BaseTest {


    @Test

    public void testAddProductToCard() throws InterruptedException {
        WebElement lietotajaVardsIevadeslauks = parluks.findElement(By.id("user_name"));
        lietotajaVardsIevadeslauks.sendKeys("standart_user");

        WebElement lietotajaParolesIevadeslauks = parluks.findElement(By.id("password"));
        lietotajaParolesIevadeslauks.sendKeys("secret_sauce");

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement productPageTitle = parluks.findElement(By.cssSelector("span.title"));
        String lapasTitulteksts = productPageTitle.getText();
        Assert.assertEquals(lapasTitulteksts, "PRODUCTS");

        Thread.sleep(5000);


    }
}
