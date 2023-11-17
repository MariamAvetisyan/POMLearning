package pages;

import org.openqa.selenium.WebDriver;

public class ProductsPage extends  BasePage{
    public  ProductsPage (WebDriver driver){
        super.driver = driver;
    }

    @Override
    public void openUrl() {
        driver.get("https://automationexercise.com/products");
    }
}
