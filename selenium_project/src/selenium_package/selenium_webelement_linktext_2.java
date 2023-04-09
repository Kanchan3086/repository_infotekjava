package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_webelement_linktext_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserobject;
		
		System.setProperty("wbdriver.driver.chromedriver", "c:\\programfiles\\chromedriver.exe");;
		
		browserobject =new ChromeDriver();
		
		browserobject.get("http://www.google.com");
		
		WebElement blogLink = browserobject.findElement(By.linkText("Gmail"));
		
		if(blogLink.isDisplayed())
		{
			System.out.println("Gmail link is displayed using linktext ");
		}
		else
		{
			System.out.println("Unable to find Gmail");
		}
		
		browserobject.findElement(By.name("q")).sendKeys("what is github");
		
		browserobject.findElement(By.name("btnk")).submit();

		browserobject.close ();
	}

}
