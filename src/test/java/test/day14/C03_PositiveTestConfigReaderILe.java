package test.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C03_PositiveTestConfigReaderILe extends TestBase {

    @Test
    public void test(){

        driver.get(ConfigReader.getProperty("CHUrl"));
        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
        concortHotelPage.ilkLoginLinki.click();
        concortHotelPage.usernameKutusu.sendKeys(ConfigReader.getProperty("CHValidUsername"));
        concortHotelPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHValidPassword"));
        concortHotelPage.loginButonu.click();
        Assert.assertTrue(concortHotelPage.basariliGirisYaziElementi.isDisplayed());

    }
}
