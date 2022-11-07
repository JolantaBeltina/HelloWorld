package lekcijaSesiTests.majasDarbs;

import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    public void testSumm(){

        int result = calculator.add(6,6);
        if (result !=12){
            Assert.fail();}
        }

        @Test
        public void testDoubleSumm(){
        double resultDouble = calculator.add(2.2,6.8);
        if (resultDouble !=9){
            Assert.fail();}
        }
        @Test
        public void testABCsumm () {
            int resultABC = calculator.add(22, 68, 96);
            if (resultABC != 186) {
                Assert.fail();
            }
        }
        @Test
        public void testMinus(){

        Assert.assertEquals(3,calculator.minus(9,6));}

        @Test
        public void testDivided(){
        Assert.assertEquals(2,calculator.divided(10,5));}

        @Test
    public void testMultiply(){
        Assert.assertEquals(100,calculator.multiply(10,10));
        }










    }



