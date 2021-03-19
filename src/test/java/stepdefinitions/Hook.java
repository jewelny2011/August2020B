package stepdefinitions;

import base.Confiq;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends Confiq {
    public static String url;
    public static String baseURL = System.getProperty("env");
    public static String browserType = System.getProperty("browser");
    // default env and browser
    public static String defaultBrowser = "ch";
    public static String defaultEnv = "qa";

    // open browser
    @Before
    public void openBrowser(){
        // default code
        if (Strings.isNullOrEmpty(browserType)){
            browserType=defaultBrowser;
        }
        if (Strings.isNullOrEmpty(baseURL)){
            baseURL=defaultEnv;
        }
        // main setup
        driver = initDriver(browserType);
        switch (baseURL){
            case "qa":
                url = "http://qa.taltektc.com";
                break;
            case "stage":
                url = "http://stage.taltektc.com";
                break;
            case "prod":
                url = "http://taltektc.com";
                break;
        }
        driver.get(url);

    }
    @After
    public void tearDown(){

      //  driver.quit();
    }

}


