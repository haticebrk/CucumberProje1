package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;


import java.time.Duration;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WD{

    private static WebDriver driver;


    public static WebDriver getDriver(){


        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");


        if(driver==null) {


            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(org.slf4j.simple.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            //fireFox istedigin browseri bu sekilde kullaniyoruz
            //    WebDriverManager.firefoxdriver().setup();
//        driver=new FirefoxDriver();
        }
        return driver;


    }
    public static void quitDriver(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(driver!=null) { //dolu ise
            driver.quit();
            driver=null;

        }
    }

}
