package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.TestBase;

public class C02_CHNegativeLoginTest extends TestBase {
    @Test
    public void NegativeLoginTest(){
        // https://www.concorthotel.com/ adresine git
        driver.get("https://www.concorthotel.com/");
        // login butonuna bas
        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
        concortHotelPage.ilkLoginLinki.click();
        // test data username: manager1 ,
        concortHotelPage.usernameKutusu.sendKeys("manager1");
        // test data password : manager1!
        concortHotelPage.passwordKutusu.sendKeys(" manager1!");
        //Degerleri girildiginde sayfaya girilemedigini test et
        concortHotelPage.loginButonu.click();
        Assert.assertTrue(concortHotelPage.isLoginFailed.isDisplayed());



    }

}
