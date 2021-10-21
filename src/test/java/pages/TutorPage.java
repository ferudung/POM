package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TutorPage {
    public WebDriver driver;
    public TutorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[6]/a")
    public WebElement phonePdsLink;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a")
    public WebElement htcText;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a")
    public WebElement iphoneText;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[1]/h4/a")
    public WebElement palmText;

    @FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
    public WebElement spt1Btn;
    @FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
    public WebElement spt2Btn;
  @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[1]")
  public WebElement bulunamayan;
    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement sepetBtn;

    @FindBy(xpath = "(//td[@class='text-left'])[1]")
    public WebElement sptHtc;
    @FindBy(xpath = "(//td[@class='text-left'])[2]")
    public WebElement sptIphone;
    @FindBy(xpath = "(//td[@class='text-left'])[3]")
    public WebElement sptPalm;




}
