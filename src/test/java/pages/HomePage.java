package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********
    String baseURL = "http://automationpractice.com";

    //*********Web Elements*********



    //*********Page Methods*********

    //Go to Homepage
    public void goToAutomationPractice() {
        driver.get(baseURL);
    }
}