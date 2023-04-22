package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_searchtext1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserobject;
		
		System.setProperty("webdriver.driver.chromedriver", "c:\\program files\\chromedriver.exe");
		browserobject = new ChromeDriver();
		browserobject.get("https://www.google.com/");
		browserobject.findElement(By.name("q")).sendKeys("Selenium python");
		browserobject.findElement(By.name("btnk")).submit();
		//browserobject.close();
		

	}

}
