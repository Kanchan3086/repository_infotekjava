package TestNg_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertionIsDisplayed {
	 WebDriver driver;
	    @Test
	    public void f() {
	// for running in Chrome, uncomment 2 following lines
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
//	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//	        driver = new FirefoxDriver();
	        driver.get("https://www.google.com/");
	        WebElement googleLogo = driver.findElement(By.xpath("//img[@alt='Google']"));
	        Assert.assertEquals(true, googleLogo.isDisplayed());
	        System.out.println("Google logo is displayed ï¿½ Assert passed");
	    }
	}
