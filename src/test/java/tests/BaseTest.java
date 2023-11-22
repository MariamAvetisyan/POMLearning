package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before suite ");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("After suite ");
    }
    WebDriver setupWebDriver(String browser){
        WebDriver driver = null;
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        return  driver;
    }

    void closeDriver(WebDriver driver){
        driver.quit();
    }
}
