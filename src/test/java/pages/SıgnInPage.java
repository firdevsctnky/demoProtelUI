package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.UUID;

public class SıgnInPage extends BasePage {

    //*********Constructor*********
    public SıgnInPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********
    String baseEmail = "automationpractice";
    String emailExtension = "@gmail.com";

    //*********Web Elements*********

    //*********Page Methods*********

    //Go to SıgnInPage
    public String signInSite() {
        String emailAddress = baseEmail + UUID.randomUUID().toString().substring(0,5)+emailExtension;
        click(By.className("login"));
        writeText(By.id("email_create"), emailAddress);
        click(By.id("SubmitCreate"));

        sleep(2000);
        writeText(By.id("customer_firstname"), "AUTOMATION");
        writeText(By.id("customer_lastname"), "PRACTICE");
        writeText(By.id("passwd"), "123456");
        writeText(By.id("address1"), "TEST ADRES");
        writeText(By.id("city"), "TEST ŞEHIR");
        writeText(By.id("postcode"), "34000");
        writeText(By.id("phone_mobile"), "5555555555");

        Select  selectedCountry = new Select(driver.findElement(By.id("id_country")));
        selectedCountry.selectByIndex(1);

        Select  selectedState= new Select(driver.findElement(By.id("id_state")));
        selectedState.selectByIndex(2);


        click(By.id("submitAccount"));

        return emailAddress;
    }
}