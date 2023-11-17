package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private static final By WOMEN = By.partialLinkText("WOMEN");
    private static final By MEN = By.partialLinkText("WOMEN");
    private static final By KIDS = By.partialLinkText("WOMEN");
    public HomePage(WebDriver driver) {
        super.driver = driver;
    }

    @Override
    public void openUrl() {
        driver.get("https://automationexercise.com/");
    }

    public void clickToWomanCategory() {
        clickToElement(WOMEN);
    }
}
