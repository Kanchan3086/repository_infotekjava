package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_formfillup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver browserobject;
		
		System.setProperty("webdriver.driver.chromedriver", "c:\\programfiles\\chromedriver.exe");
		
		browserobject = new ChromeDriver();
		browserobject.get("http://www.training.qaonlinetraining.com/testPage.php");
		
		browserobject.findElement(By.name("name")).sendKeys("kanchan mahadik");
		browserobject.findElement(By.name("email")).sendKeys("kanchan@email.com");
		browserobject.findElement(By.name("website")).sendKeys("www.demowebsite.com");
		
		browserobject.findElement(By.name("comment")).sendKeys("this is comment");
		browserobject.findElement(By.name("submit")).click();
		//browserobject.close();		
		
		
		
		
	}

}
