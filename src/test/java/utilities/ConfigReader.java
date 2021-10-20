package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1- Properties objesi olusturucağız

    static  Properties properties;
    //2- Bu classın amacı confiruguration.properties
    // dosyasını okumak ve key value ikililerini kullanarak
    // istediğimiz keye adi value'yu bize gertirmek
    static {
        String dosyaYolu="configuration.properties";

        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }


    //3- Test classlarından configReader classına ulasıp
    // yukardaki işlemleri yapmamızı saglayacak bir method olusturacağız

public static String getProperty(String key){

        String value=properties.getProperty(key);
        return value;
}
}
