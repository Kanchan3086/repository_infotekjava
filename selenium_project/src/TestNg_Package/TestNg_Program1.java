package TestNg_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v107.runtime.model.WebDriverValue;
import org.testng.annotations.Test;

public class TestNg_Program1 {
	 WebDriver driver;
	 

	
	
  @Test
  public void f() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
	 
	 driver.get("www.amazon.com");
	WebElement websearch1;
	websearch1 =driver.findElement(By.id("twotabsearchtextbox"));
	//websearch1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	//driver.findElement(By.xpath("//input[@value='female']")).click();
	//*[@id="nav-search-submit-button"]
	websearch1.sendKeys("kids toys");
	WebElement websearch2;
	websearch2 =driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
	websearch2.click();
	Thread.sleep(3000);
	driver.close();
	//*[@id="twotabsearchtextbox"]
	//WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	//searchBox.sendKeys("selenium");
	//WebElement searchButton = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));

	
	//System.out.println("Testing TestNg");
  }
}
