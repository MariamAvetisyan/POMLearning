package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    WebDriver driver;

    Duration timeout = Duration.ofSeconds(10);

    abstract void openUrl();

    WebElement getVisibleElement( By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    WebElement getClickableElement( By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    void clickToElement( By locator) {
        getClickableElement(locator).click();
    }
}
