package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
public class CoursePage {
    public WebDriver driver;
    public CoursePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@value='Sign up']")
    public WebElement signInBtn;

    @FindBy(xpath = "//*[@class='fa fa-caret-down']")
    public WebElement dropDown;
    @FindBy(xpath = "(//*[@class='dropdown__menu-item'])[1]")
    public WebElement dropDownAccount;
    @FindBy(id = "user[email]")
    public WebElement eMailText;
    @FindBy(id = "user[first_name]")
    public WebElement isimText;
    @FindBy(id = "user[last_name]")
    public WebElement soyIsimText;



    public void CoursePageSignUp(){
        Driver.getDriver().get(ConfigReader.getProperty("courseUrl"));
        CoursePage coursePage=new CoursePage();
    }
}