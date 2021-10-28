package tests.day17;

import org.testng.annotations.Test;
import pages.DemoQA_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class HomeWork_DemoQA  {

    @Test
            public void test(){
        HomeWork_DemoQA homeWork_demoQA=new HomeWork_DemoQA();
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
        DemoQA_Page.sutunYazdir(ConfigReader.getProperty("demoqa_istenen_sutun_no"));


    }



}
