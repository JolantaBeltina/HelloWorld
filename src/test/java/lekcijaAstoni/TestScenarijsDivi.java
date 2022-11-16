package lekcijaAstoni;

import lekcijaAstoni.pageObjects.CardPage;
import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import lekcijaSeptini.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarijsDivi extends BaseTest {

    @Test

    public void testCheckoutPageMandatoryField() throws InterruptedException {
        System.out.println("1.");
        LoginPage loginPage = new LoginPage(parluks);
        ProductsPage produktulapa = new ProductsPage(parluks);
        loginPage.login("standard_user","secret_sauce");
        Assert.assertEquals(produktulapa.getPageTitle().getText(),"PRODUCTS");
        System.out.println("3.Doties uz Grozu");
        produktulapa.getCardButton().click();
        Thread.sleep(5000);
        System.out.println("4. Doties uz čekoutu");
        System.out.println("3. Doties uz grozu");
        CardPage grozaLapa = new CardPage(parluks);
        produktulapa.getCardButton().click();
        Assert.assertEquals(grozaLapa.getpageTitle(),"YOUR CART");
        System.out.println("4. Doties uz Checkout");






    }


}
