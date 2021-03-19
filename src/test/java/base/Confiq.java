package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Confiq {


    public static WebDriver driver;
    public static WebDriver initDriver(String driverType){

        if(driverType.equalsIgnoreCase("ch")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

        }else if(driverType.equalsIgnoreCase("ff")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else if(driverType.equalsIgnoreCase("ie")){
            WebDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();
        }
        return driver;
    }
}
