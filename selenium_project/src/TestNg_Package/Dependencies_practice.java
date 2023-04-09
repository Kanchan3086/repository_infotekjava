package TestNg_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependencies_practice {
	WebDriver driver;
    @Test()
    public void openingCNNSite() throws InterruptedException {
        System.out.println("Open cnn.com in chrome browser\nby-default runs first\n\n");
        driver.get("http://www.cnn.com/");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = "openingCNNSite")
    public void openingAmazonSite() throws InterruptedException {
        System.out.println("Open amazon.com in chrome browser\ndependsOnMethods = openingCNNSite\n\n");
        driver.get("http://www.amazon.com/");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = "openingAmazonSite")
    public void openingYahooSite() throws InterruptedException {
        System.out.println("Open yahoo.com in chrome browser\ndependsOnMethods = openingAmazonSite\n\n");
        driver.get("http://www.yahoo.com/");
        Thread.sleep(2000);
    }
    @BeforeTest
    public void beforeTest() {
        // for running in Chrome, uncomment 2 following lines
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.out.println("beforeTest\nSet System properties ; create object\n\n");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("afterTest\nclose the website\n\n");
        driver.close();
    }
}
