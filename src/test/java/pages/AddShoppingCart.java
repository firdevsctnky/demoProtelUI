package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddShoppingCart extends BasePage {

    //*********Constructor*********
    public AddShoppingCart(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********

    //*********Web Elements*********



    //*********Page Methods*********

    //Go to Homepage
    public void addShoppingCart() {
    click(By.xpath("//*[@id=\"header_logo\"]/a"));
    sleep(2000);
    scrollDown();
        scrollDown();
        //click(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]"));
        sleep(2000);
        click(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]"));
        sleep(2000);
        scrollDown();
        click(By.id("add_to_cart"));
        sleep(2000);
        click(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
        sleep(2000);
        scrollDown();
        click(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
        scrollDown();
        sleep(2000);
        click(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
        click(By.id("uniform-cgv"));
        scrollDown();
        sleep(2000);
        click(By.xpath("//*[@id=\"form\"]/p/button"));
        click(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
        scrollDown();
        sleep(2000);
        click(By.xpath("//*[@id=\"cart_navigation\"]/button"));

    }
}
