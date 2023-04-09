package TestNg_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Search_AmazonButton {
	
	WebDriver driver;
  @Test
  
  public void Amazon_search() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 
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

