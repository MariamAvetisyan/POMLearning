package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;

public class RegistrationTests extends BaseTest {
    @Test
    void test1() {
        WebDriver driver = setupWebDriver("chrome");
        HomePage homePage = new HomePage(driver);
        homePage.openUrl();
        homePage.clickToWomanCategory();
    }

    @Test
    void test2() {
        WebDriver driver = setupWebDriver("chrome");
        ProductsPage homePage = new ProductsPage(driver);
        homePage.openUrl();
    }
}
