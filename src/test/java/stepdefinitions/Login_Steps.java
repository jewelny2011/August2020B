package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Steps {
WebDriver driver;

    @Given(":I am at talentTEK home page")
    public void i_am_at_talent_tek_home_page() {
        System.setProperty("webdriver.chrome.driver","/Users/mdjewel/Downloads/chromedriver");
        driver =new ChromeDriver();
        driver.get("http://qa.taltektc.com/");
        System.out.println("This is talenTek page");
    }

    @And(":I enter valid email")
    public void i_enter_valid_email() {
        driver.findElement(By.xpath("//input[@placeholder='Email address or Student ID']")).sendKeys("promilimo4@gmail.com");
        System.out.println("This is Valid email");
    }

    @And(":I enter valid password")
    public void i_enter_valid_password() {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("jewel1973");
        System.out.println("This Is valid password");
    }

    @When(":I click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        System.out.println("This is login");
    }

    @Then(":I will verify I successfully logged into my existing account")
    public void i_will_verify_i_successfully_logged_into_my_existing_account() {

        System.out.println("This is verify account");
    }

    @And(":I close browser")
    public void i_close_browser() {
      System.out.println("This is close browser");
      driver.quit();
    }



}
