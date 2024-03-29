package tests.day15;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.Driver;

public class C02_E2ETest {
    @Test
    public void test() throws InterruptedException {
        //1. Tests packagenin altına class olusturun: D17_CreateHotel
        //2. Bir metod olusturun: createHotel
        //3. https://qa-environment.concorthotel.com/ adresine git.

        QAConcortPage qaConcortPage =new QAConcortPage();

        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
        //    a. Username : manager
        //    b. Password  : Manager1!
        //5. Login butonuna tıklayın
        qaConcortPage.ConcortHotelLogin();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        qaConcortPage.hotelManagementLink.click();
        qaConcortPage.hotelListLink.click();
        qaConcortPage.addHotelLink.click();
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();

        actions.
                click(qaConcortPage.addHotelCodeKutusu).
                sendKeys(faker.address().zipCode()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().name()).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).perform();

        Select select=new Select(qaConcortPage.idGroupKutusu);
        select.selectByIndex(1);


        //8. Save butonuna tıklayın.
        qaConcortPage.savebutonu.click();
        Thread.sleep(2000);
        //9. "Hotel was inserted successfully" textinin göründüğünü test edin.
        Assert.assertTrue(qaConcortPage.alertBox.isDisplayed());
        //10. OK butonuna tıklayın.
        qaConcortPage.okBtn.click();

    }
}