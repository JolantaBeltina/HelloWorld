package seleniumHomework;

import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import lekcijaSeptini.labDarbs.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsHomework.CheckoutOverviewPage;
import pageObjectsHomework.CheckoutPage;
import pageObjectsHomework.CheckoutSuccessPage;
import pageObjectsHomework.InventoryPage;

import java.time.Instant;

public class sauceDemoTests extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user","secret_sauce");
        ProductsPage produktulapa = new ProductsPage(parluks);
        wait.until(ExpectedConditions.visibilityOf(produktulapa.getPageTitle()));
        Assert.assertEquals(produktulapa.getPageTitle().getText(),"PRODUCTS");
        InventoryPage inventoryPage = new InventoryPage(parluks);
        inventoryPage.getAddToCartBackpackButton().click();
        inventoryPage.getCardButton().click();
        CheckoutPage checkoutPage = new CheckoutPage(parluks);
        checkoutPage.getCheckoutButton().click();
        CheckoutSuccessPage checkoutSuccessPage = new CheckoutSuccessPage(parluks);
        checkoutSuccessPage.login("Jolanta","Beltina","LV-2008");
        checkoutSuccessPage.getContinueButton().click();
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(parluks);
        checkoutOverviewPage.getFinishButton().click();
        checkoutOverviewPage.getCheckoutCompleteContainer().isDisplayed();
        checkoutOverviewPage.getBackHomeButton().click();





    }

}
