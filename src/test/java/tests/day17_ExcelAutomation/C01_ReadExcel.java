package tests.day17_ExcelAutomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class C01_ReadExcel {

    @Test
    public void test() throws IOException {
        //7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu="src/test/java/resources/ulkeler.xlsx";
        //8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
        //9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        //10. WorkbookFactory.create(fileInputStream)
        Workbook workbook= WorkbookFactory.create(fileInputStream);

        //11. Worksheet objesi olusturun workbook.getSheetAt(index)
        Sheet sheet= workbook.getSheet("sayfa1");
        //12. Row objesi olusturun sheet.getRow(index)
        Row row= sheet.getRow(4);


        //13. Cell objesi olusturun row.getCell(index)
        Cell cell= row.getCell(1);
        System.out.println(cell);
    }
    @Test(groups = "birinciGrup")
    public void test2() throws IOException {
        //7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu="src/test/java/resources/ulkeler.xlsx";
        //8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
        //9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        //10. WorkbookFactory.create(fileInputStream)
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        //11. Worksheet objesi olusturun workbook.getSheetAt(index)
        //12. Row objesi olusturun sheet.getRow(index)
        //13. Cell objesi olusturun row.getCell(index)
        Cell cell=workbook.getSheet("sayfa1").getRow(5).getCell(3);
        System.out.println(cell);
        //secilen hüceredeki yazının ruanda olduğunu test edin
       // ****Assert.assertEquals(cell,"Luanda");
        //****cell in data türü cell, "Luanda" ise string
        //data türleri darklı olduğu için equal olamaz
        //cell data türü yazdırılabilir ancak string methodları kullanılamaz
        //string manupulation yapmak için celle dat türünü String Cast yapmalıyız
        Assert.assertEquals(cell.toString(),"Luanda");
        Assert.assertEquals(cell.getStringCellValue(),"Luanda");

        //indexi 3 olan satırdaki indexi 2 olan hücredeki yazıyı buyuk harf ile yazdırın
       cell=workbook.getSheet("sayfa1").getRow(2).getCell(3);
        System.out.println(cell.toString().toUpperCase());



        //getLastRowNum :bize son satırın indexini verir
        //getPhysicalNumberOfRows : fiili olarak kullanılan satır sayısını verir
        System.out.println(workbook.getSheet("sayfa1").getLastRowNum()); //190
        System.out.println(workbook.getSheet("sayfa1").getPhysicalNumberOfRows());//191
        System.out.println(workbook.getSheet("sayfa1").getFirstRowNum());//0

        System.out.println(workbook.getSheet("sayfa2").getLastRowNum()); //13
        System.out.println(workbook.getSheet("sayfa2").getPhysicalNumberOfRows());//8
        System.out.println(workbook.getSheet("sayfa2").getFirstRowNum());//0

        System.out.println(workbook.getSheet("sayfa3").getLastRowNum()); //-1
        System.out.println(workbook.getSheet("sayfa3").getPhysicalNumberOfRows());//0
        System.out.println(workbook.getSheet("sayfa3").getFirstRowNum());//-1

    }

    @Test
    public void test3() throws IOException {
        // tablodaki 2.sutunu bir liste olarak yazdirin
        List<String> ikinciSutun=new ArrayList<>();
        String dosyaYolu="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fileInputStream);

        for (int i=0; i<=workbook.getSheet("Sayfa1").getLastRowNum(); i++){
            ikinciSutun.add(workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString());
        }

        System.out.println(ikinciSutun);

        //2. sutunda ki  A ile baslayan sehirleri liste yapip yazdirin
        List<String> aIleBaslayanSehirler=new ArrayList<>();

        for (String each: ikinciSutun
        ) {
            if (each.startsWith("A")){
                aIleBaslayanSehirler.add(each);
            }
        }
        System.out.println(aIleBaslayanSehirler);

        // eger tum datayi java'da kullanilabilir bir collection'a cevirmek istesek
        // en uygun yapi map olur
        // map icin unique degerlere sahip bir sutunu key
        // geriye kalan tum sutunlari ise virgulle ayrilan string'ler olarak value yapmaliyiz
        // key=Turkey value=Ankara, Turkiye, Ankara

        Map<String,String> ulkelerMap=new HashMap<>();
        String key="";
        String value="";
        for (int i=0; i<=workbook.getSheet("Sayfa1").getLastRowNum(); i++){

            key=workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            value= workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString() + ", "+
                    workbook.getSheet("Sayfa1").getRow(i).getCell(2).toString() + ", "+
                    workbook.getSheet("Sayfa1").getRow(i).getCell(3).toString();
            ulkelerMap.put(key,value);

        }

        System.out.println(ulkelerMap);

        // Biz java method'larini ve collections'i kullanarak excel'deki datalari
        // manipule edebilecegimiz Java ortamina alabiliriz
    }
}
