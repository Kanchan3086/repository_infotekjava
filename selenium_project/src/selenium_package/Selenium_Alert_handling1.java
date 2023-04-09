package selenium_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Alert_handling1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 driver.findElement(By.name("proceed")).click();
		 Alert alert = driver.switchTo().alert();
		 Thread.sleep(3000);
		//alert.getText();
		System.out.println(alert.getText());
		alert.accept();
		
		 
		 
		
		
		
		
		

	}

}
