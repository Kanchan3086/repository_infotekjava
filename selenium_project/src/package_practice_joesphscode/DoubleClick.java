package package_practice_joesphscode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/login");
		WebElement rememberMe = driver.findElement(By.xpath("//span[text()='Remember me']"));
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		
		ac.doubleClick(rememberMe).perform();
		
		

	}


	}


