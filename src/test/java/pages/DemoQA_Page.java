package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class DemoQA_Page {
    WebDriver driver;
    public DemoQA_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    public static void sutunYazdir(String demoqa_istenen_sutun_no){
     //   List<WebElement>satirlarListesi=new ArrayList<>();
       // for (int i=1; i<=satirlarListesi.size();i++){
            WebElement element =Driver.getDriver().findElement(By.xpath("((//div[@class='rt-tr-group'])[" +demoqa_istenen_sutun_no+ "]//div//div)[6]"));
            System.out.println(element.getText());
        //}
    }
}
