package test.day14;

import org.openqa.selenium.interactions.Actions;
import org.testng.ReporterConfig;
import org.testng.annotations.Test;
import pages.HomeworkPage;
import utilities.ConfigReader;
import utilities.TestBase;

import javax.swing.*;

public class Homework extends TestBase {
    /*
    go to url : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    Fill in capitals by country
     */
@Test
    public void test(){

    driver.get(ConfigReader.getProperty("dhtmlUrl"));
    Actions actions=new Actions(driver);
    HomeworkPage homeworkPage=new HomeworkPage(driver);
    actions.dragAndDrop(homeworkPage.Copenhagenbtn,homeworkPage.denmarkBox);
    actions.dragAndDrop(homeworkPage.Washington,homeworkPage.usaBox);
    actions.dragAndDrop(homeworkPage.stockholmBtn,homeworkPage.swedenBox);
    actions.dragAndDrop(homeworkPage.romeBtn,homeworkPage.romeItaly);
    actions.dragAndDrop(homeworkPage.Oslo,homeworkPage.Norway);
    actions.dragAndDrop(homeworkPage.seul,homeworkPage.gkBtn);
    actions.dragAndDrop(homeworkPage.madridbtn, homeworkPage.spainBox).perform();

}
}
