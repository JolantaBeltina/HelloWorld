package lekcijaSesiTests.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRinkis {

    @BeforeTest
    public void pirmsTesta(){
        System.out.println("Šī ir BEFORE testa anotācija");
    }
    @AfterTest
    public void pecTesta(){
        System.out.println("Šī ir AFTER test anotācija");
    }


    @BeforeMethod
    public void setup(){
        System.out.println("Šī metode tiek izpildīta pirms katra testa");
    }

    @BeforeMethod
    public void pecDarbibas(){
        System.out.println("Šī metode tiek izpildīta pēc katra testa");
    }
    @Test
    public void testRekinatLaukumu(){
        System.out.println("Tests, kurš testē kā rēķinās riņķa laukums");
        Rinkis mansRinkis = new Rinkis(4.5);

        // expectedResult
        // actualResult

        Double expectedArea = 63.585;
        //rezultāts ko izrēķinās formula "rekinatLaukumu"
        Double actualArea = mansRinkis.rekinatLaukumu();
        //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea,expectedArea);
    }



     @Test
   public void testRinkaLinijaNulle() {
         System.out.println("Testējam riņķa līnijas garuma aprēķinu");
         Rinkis mansRinkis = new Rinkis(0.0);
         Double expectedLine = 0.0;
         Double actualLine = mansRinkis.rekinatLinijasGarumu();
         Assert.assertEquals(actualLine, expectedLine);
     }

    @Test
    public void testRinkaLinijaDalskaitlis(){
        System.out.println("Testējam riņķa līnijas garuma aprēķinu");
        Rinkis mansRinkis = new Rinkis(8.9);
        Double expectedLine = 55.892;
        Double actualLine = mansRinkis.rekinatLinijasGarumu();
        Assert.assertEquals(actualLine,expectedLine);
    }

    @Test
    public void testRinkaLinijaVeselsSkaitlis(){
        System.out.println("Testējam riņķa līnijas garuma aprēķinu");
        Rinkis mansRinkis = new Rinkis(4.0);
        Double expectedLine = 25.12;
        Double actualLine = mansRinkis.rekinatLinijasGarumu();
        Assert.assertEquals(actualLine,expectedLine);
    }

    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
        System.out.println("Tests kurš testē kā rēķinās riņķa laukums");
        Rinkis mansRinkis = new Rinkis(radiuss);
        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts
        Double expectedArea = sagaidamaisLaukums;
        Double actualArea = mansRinkis.rekinatLaukumu();
        //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea,expectedArea);
    }

    // īsais variants:

//    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
//        System.out.println("Tests kurš testē kā rēķinās riņķa laukums");
//        Rinkis mansRinkis = new Rinkis(radiuss);
//        Assert.assertEquals(mansRinkis.rekinatLaukumu(),sagaidamaisLaukums);
//    }




}

