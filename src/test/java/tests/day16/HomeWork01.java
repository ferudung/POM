package tests.day16;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CoursePage;
import utilities.ConfigReader;
import utilities.Driver;
public class HomeWork01 {
    @Test
    public void test1() throws InterruptedException {
        /*
         * Part 1:
         *  Open "https://courses.ultimateqa.com/users/sign_up"
         */
        CoursePage coursePage=new CoursePage();
        Driver.getDriver().get(ConfigReader.getProperty("courseUrl"));
        /*  create random and valid first name, last name, email and password, store for later validating
         *  fill in account submission form with data above*/
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        String isim=faker.name().name();
        String soyIsim=faker.name().lastName();
        String eMail=faker.internet().emailAddress();
        String password=faker.internet().password();
        actions.
                sendKeys(isim).
                sendKeys(Keys.TAB).
                sendKeys(soyIsim).
                sendKeys(Keys.TAB).
                sendKeys(eMail).
                sendKeys(Keys.TAB).
                sendKeys(password).
                sendKeys(Keys.TAB).
                sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);

coursePage.signInBtn.click();


        /*
         *  Click on checkbox with id="user[terms]" to agree with terms and conditions
         *  click on "Sign up" button*/
        coursePage.dropDown.click();
        coursePage.dropDownAccount.click();
        /* validate that first name, last name and email you provided earlier is correct
         */
        Assert.assertTrue(eMail.contains(coursePage.eMailText.getText()));
        Assert.assertTrue(isim.contains(coursePage.isimText.getText()));
        Assert.assertTrue(soyIsim.contains(coursePage.soyIsimText.getText()));
    }
    @Test
    public void test2(){
        /*
         * Part 2 (Optional)
         *  sign out of the website
         *  go to "https://courses.ultimateqa.com/users/sign_in"
         *  fill in sign in form with your stored email and password
         *  click on "Sign in" button
         *  validate that message "Signed in successfully." is displayed
         *
         * NOTE:Captcha on this website is un-avoidable,
         * so you will have to solve it by hand to allow script to continue
         */
    }}
