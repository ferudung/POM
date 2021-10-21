package tests.day13;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TutorPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class MentorHomework {

    /*






    ~ compare the names from displaying list and cart list

clickAllElements
getName
compareTwoList
     */


    @Test
    public void test(){
//~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
        Driver.getDriver().get(ConfigReader.getProperty("tutorUrl"));
        //~ click on Phones & PDAs
        TutorPage tutorPage=new TutorPage();
        Actions actions=new Actions(Driver.getDriver());
        tutorPage.phonePdsLink.click();
        // ~ get the brandName of phones

        String htc=tutorPage.htcText.getText();
        String iphone=tutorPage.iphoneText.getText();
       String palm=tutorPage.palmText.getText();

        String arr[]= {htc,iphone,palm};
        List<String> arrTelefonList= Arrays.asList(arr);


        //~  click on add to button for all elements

        tutorPage.spt1Btn.click();
        tutorPage.spt2Btn.click();
        tutorPage.bulunamayan.click();
        tutorPage.sepetBtn.click();
// ~ get the names of list from the cart

        String sptHtc1=tutorPage.sptHtc.getText();
        String sptIphone1=tutorPage.sptIphone.getText();
        String sptPalm1=tutorPage.sptPalm.getText();
        String arr2[]={sptHtc1,sptIphone1,sptPalm1};
        List<String>arrSepettekiTelefonList=Arrays.asList(arr2);
      //  Assert.assertTrue(sepet.listIterator().next().getText().contains(markalar.listIterator().next().getText()));
        Assert.assertTrue(arrSepettekiTelefonList.listIterator().next().contains(arrTelefonList.listIterator().next()));

    }


}
