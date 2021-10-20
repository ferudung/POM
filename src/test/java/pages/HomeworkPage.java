package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeworkPage {

    WebDriver driver;
    public  HomeworkPage(){

    }
    public HomeworkPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="box4")
    public WebElement Copenhagenbtn;//Washington

    @FindBy(id="box104")
    public WebElement denmarkBox;

    @FindBy(id="box3")
    public WebElement Washington;//

    @FindBy(id="box103")
    public WebElement usaBox;

    @FindBy(id = "box2")
    public WebElement stockholmBtn;

    @FindBy(id = "box102")
    public WebElement swedenBox;
    @FindBy(id="box6")
    public WebElement romeBtn;

    @FindBy(id="box106")
    public WebElement romeItaly;

    @FindBy(id = "box1")
    public WebElement Oslo;
    @FindBy(id = "box101")
    public WebElement Norway;

    @FindBy(id = "box5")
    public WebElement seul;
    @FindBy(id = "box105")
    public WebElement gkBtn;

    @FindBy(id="box7")
    public WebElement madridbtn;

    @FindBy(id = "box107")
    public WebElement spainBox;
}
