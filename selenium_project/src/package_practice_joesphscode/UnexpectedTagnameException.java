package package_practice_joesphscode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnexpectedTagnameException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		Thread.sleep(6000);
		WebElement preferedLanguage = driver.findElement(By.xpath("//span[text()='Preferred Language']"));
		Thread.sleep(6000);
		Select sel = new Select(preferedLanguage);
		//sel.selectByVisibleText("English");

	}

	}


