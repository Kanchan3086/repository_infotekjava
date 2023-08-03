package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium_dropdown_select_practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver browserobject;
		
		System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
		
		browserobject = new ChromeDriver();
		
		browserobject.get("http://training.qaonlinetraining.com/testPage.php");
		
		Select countryselect = new Select(browserobject.findElement(By.name("country")));
		
		countryselect.selectByVisibleText("USA");
		
		countryselect.selectByVisibleText("India");
		
		
		Select skillselect = new Select(browserobject.findElement(By.name("skill")));
		
		skillselect.selectByVisibleText("Programming");
		
		skillselect.selectByVisibleText("Database");
	
		System.out.println("selectByVisibleText(\"Database");
		
		browserobject.findElement(By.name("submit")).click();
		
		System.out.println("form fill up successfully");
		
		browserobject.close();
		
		
		
		
		
		
		
	}

}
