package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddShoppingCart;
import pages.HomePage;
import pages.SıgnInPage;

public class ProtelTest extends BaseTest {


    @Test
    public void protel() throws InterruptedException {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver, wait);
        SıgnInPage signInPage = new SıgnInPage(driver,wait);
        AddShoppingCart shoppingCart = new AddShoppingCart(driver,wait);

        //*************PAGE Methods********************
        //Open AutomationPractice HomePage
        homePage.goToAutomationPractice();
        String createdEmail = signInPage.signInSite();
        shoppingCart.addShoppingCart();
        //*************ASSERTIONS***********************
        Thread.sleep(500);
    }
}