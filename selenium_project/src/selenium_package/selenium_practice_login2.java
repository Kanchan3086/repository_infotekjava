package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_practice_login2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver browserobject;
		
		// 1. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
		System.setProperty("webdriver.driver.chromedriver", "c:\\programfiles\\chromedriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
		browserobject = new ChromeDriver();
		
		// 3. Open login page of https://admin-demo.nopcommerce.com/login
		browserobject.get("http://admin-demo.nopcommerce.com/login");
		
		// 4. Get reference of Email input box by locate the id method.
		WebElement email= browserobject.findElement(By.id("Email"));
		email.clear();
		
		WebElement password= browserobject.findElement(By.id("Password"));
		password.clear();
		
		email.sendKeys("admin@yourstore.com");
		
		password.sendKeys("admin");
		
		WebElement button= browserobject.findElement(By.className("button-1"));
		
		button.submit();
		//browserobject.findElement(By.className("button-1")).click();	
		browserobject.close();
		
		
		
		
		
		
		
	}

}
