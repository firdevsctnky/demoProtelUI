package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setup() {

        //Create a Chrome driver. All test and page classes use this driver.
//        System.setProperty(
//                "webdriver.chrome.driver",
//                "C:\\Users\\firdevs.cetinkaya\\Desktop\\chromedriver.exe");
        String workingDir = System.getProperty("user.dir");
        System.out.println(workingDir);
        System.setProperty("webdriver.chrome.driver",workingDir+"\\chromedriver.exe");
        driver = new ChromeDriver();

        //Create a wait. All test and page classes use this wait.
        wait = new WebDriverWait(driver, 15);

        //Maximize Window
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}
