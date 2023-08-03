package package_practice_joesphscode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");

	     WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	     WebElement account = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	     Actions ac = new Actions(driver);
	     Thread.sleep(2000);
	     ac.dragAndDrop(sales, account).perform();
	}

	}


