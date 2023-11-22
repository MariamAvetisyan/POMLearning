package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Deleted_AccountPage;
import pages.HomePage;
import pages.Signup_LoginPage;

import static tests.SignupTests.username;

public class LoginTests extends BaseTest {
    @Test(priority = 2)
    void LoginTestWithCorrectDate() {
        SoftAssert softAssert = new SoftAssert();

        WebDriver driver = setupWebDriver("chrome");

        HomePage homePage = new HomePage(driver);
        homePage.openURL();
        homePage.clickonSignUpLoginbutton();

        Signup_LoginPage signupLoginPage = new Signup_LoginPage(driver);
        signupLoginPage.fillSignInForm(username, "4525444s");
//        homePage.displayedSignedIcon();
//        homePage.logOutElement();

        softAssert.assertEquals(driver.getTitle(), "Automation Exercise - Signup / Login");

        driver.quit();
        softAssert.assertAll();
    }

    @Test(priority = 0)
    void LoginTestWithIncorrectDate() {
        WebDriver driver = setupWebDriver("chrome");
        Signup_LoginPage signupLoginPage = new Signup_LoginPage(driver);
        signupLoginPage.openURL();
        signupLoginPage.sendLoginEmail("Joh99n@abc.com");
        signupLoginPage.sendLoginPassword("pass1882");
        signupLoginPage.clickOnLoginSubmit();
        signupLoginPage.displayedIncorrectText();
        driver.quit();
    }

    @Test(priority = 3)
    void DeleteLoggedAccount() {
        WebDriver driver = setupWebDriver("chrome");
        Signup_LoginPage signupLoginPage = new Signup_LoginPage(driver);
        Deleted_AccountPage deletedAccountPage = new Deleted_AccountPage(driver);
        signupLoginPage.openURL();
        signupLoginPage.sendLoginEmail("John@a4c1.com");
        signupLoginPage.sendLoginPassword("4525444s");
        signupLoginPage.clickOnLoginSubmit();
        HomePage homePage = new HomePage(driver);
        homePage.deleteAccount();
        deletedAccountPage.displayText();
        deletedAccountPage.clickonContinue();
        driver.getTitle();
        driver.quit();
    }


}
