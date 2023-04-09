package Practice_Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_open_website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		driver = new ChromeDriver();
		
		driver.get("www.amazon.com");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		

	}

}
