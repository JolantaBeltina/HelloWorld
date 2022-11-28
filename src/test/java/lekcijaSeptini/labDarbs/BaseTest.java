package lekcijaSeptini.labDarbs;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
   public WebDriver parluks;
   public WebDriverWait wait;




    @BeforeMethod
    public void setupBrowser() throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "<Build 1>");
        sauceOptions.put("name", "<Jolanta Special remote test>");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://oauth-joliteb-a0e98:951f7055-0ed8-4efa-89e8-cca094f89c7a@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
       parluks  = new RemoteWebDriver(url, browserOptions);
       wait = new WebDriverWait(parluks,Duration.ofSeconds(10));
        parluks.manage().window().maximize();
        parluks.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        parluks.get("https://www.saucedemo.com/");


    }
    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();
    }
}
