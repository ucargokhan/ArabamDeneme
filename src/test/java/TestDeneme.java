import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestDeneme

{
    public String baseUrl = "https://www.arabam.com/";
    public WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.get(baseUrl);
        TimeUnit.SECONDS.sleep(5);

    }

    @AfterTest
    public void tearDown(){
        //driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("div>nav>ul>li:nth-of-type(1)"))).moveToElement(driver.findElement(By.cssSelector("div>nav>ul>li:nth-of-type(1)"))).click().build().perform();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.cssSelector("a[data-layer='Trink sat!, Teklif Al']")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.cssSelector("button[class='start-steps btn btn-blue']")).click();
    }
}
