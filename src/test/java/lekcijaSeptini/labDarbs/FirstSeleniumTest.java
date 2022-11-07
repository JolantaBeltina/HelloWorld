package lekcijaSeptini.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest extends BaseTest {


    @Test

    public void testFirstWebPage(){
        System.out.println("Pirmais Selenium Tests");
//        parluks.navigate().to("https://www.lu.lv/");
//         vai arī caur get
       parluks.get("https://www.lu.lv/");

    }

    @Test
    public void testPageTitle(){
        parluks.get("https://www.lu.lv/");
        String nosaukums = parluks.getTitle();
            Assert.assertEquals(nosaukums, "Latvijas Universitāte");
    }




}
