package package_practice_joesphscode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com");
		WebElement beautiDropDown  = driver.findElement(By.xpath("//span[text()='Beauty, Health & Daily Needs']"));
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		ac.moveToElement(beautiDropDown).perform();
		WebElement option = driver.findElement(By.xpath("//span[text()='Brushes & Applicators']"));
		Thread.sleep(3000);
		ac.moveToElement(option).click(option).perform();
		
		

	}

	}


