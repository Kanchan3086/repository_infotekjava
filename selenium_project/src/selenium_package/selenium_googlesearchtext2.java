package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_googlesearchtext2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserobject;
		
		System.setProperty("webdriver.driver.chromedriver", "c:\\program files\\chromedriver.exe");
		
		browserobject = new ChromeDriver();
		
		browserobject.get("https://www.google.com/");
		browserobject.findElement(By.name("q")).sendKeys("worlds top 10 countries to live");
		browserobject.findElement(By.name("btnk")).submit();

	}

}
