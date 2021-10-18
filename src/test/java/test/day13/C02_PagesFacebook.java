package test.day13;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.TestBase;

public class C02_PagesFacebook extends TestBase {
// facebook login sayfasina gidin
// kullanici adi : techproed
// sifre : 12345
// yazdigimizda giris yapamadigimizi test edin
    //gace sayfasında cookiesGec() methodu olusturun


    @Test
    public void test(){
        driver.get("http://www.facebook.com");

        FacebookPage facebookPage=new FacebookPage(driver);
       // facebookPage.cookiesgec();
        facebookPage.mailKutusu.sendKeys("techproed");
        facebookPage.sifreKutusu.sendKeys("12345");
        facebookPage.LoginTusu.click();
        Assert.assertTrue(facebookPage.girilmediYaziElementi.isDisplayed());
    }

}
