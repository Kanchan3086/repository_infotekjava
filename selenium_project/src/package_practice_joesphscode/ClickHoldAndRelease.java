package package_practice_joesphscode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldAndRelease {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement forGotPassLink = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		Actions ac = new Actions(driver);
		ac.clickAndHold(forGotPassLink).perform();
		Thread.sleep(2000);
		ac.release(forGotPassLink).perform();
		

	}

	}


