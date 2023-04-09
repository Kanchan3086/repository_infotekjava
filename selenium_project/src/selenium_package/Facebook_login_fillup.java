package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_fillup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("kanchan@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		
		//driver.close();
		

	}

}
