package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Created_AccountPage extends BasePage {
    private static final By ACC_CREATEDTEXT = By.cssSelector("[data-qa='account-created']");
    private static final By CONTINUEBUTTON = By.cssSelector("[data-qa=continue-button]");

    public Created_AccountPage(WebDriver driver) {
        super.driver = driver;
    }

    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/");
    }

    public boolean isCreatedTextShown() {
        System.out.println("Account Created text is displayed ");
        return isElementVisible(ACC_CREATEDTEXT, Duration.ofSeconds(5));
    }

    public void clickOnContinueButton() {
        clickOnElement(CONTINUEBUTTON);
    }
}
