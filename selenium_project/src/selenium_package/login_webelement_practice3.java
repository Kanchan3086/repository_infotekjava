package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_webelement_practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver browserobject;
		
		System.setProperty("webdriver.driver.chromedriver", "c:\\programfiles\\chromedriver.exe");
		
		browserobject= new ChromeDriver();
		
		
		browserobject.get("http://admin-demo.nopcommerce.com/login");
		
		WebElement email= browserobject.findElement(By.id("Email"));
		
		email.clear();
		
		
		WebElement password= browserobject.findElement(By.id("Password"));
		
		password.clear();
		
		
		email.sendKeys("admin@yourstore.com");
		
		
		password.sendKeys("admin");
		
	WebElement button =	browserobject.findElement(By.className("button-1"));
	
	button.submit();
	 
		
	//browserobject.close();	
		
		
	}

}
