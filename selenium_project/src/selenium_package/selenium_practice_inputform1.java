package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_practice_inputform1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserobject;
		System.setProperty("webDriver.driver.chromeDriver", "c:\\programfiles\\chromedriver.exe");
		
 browserobject = new ChromeDriver();
 browserobject.get("http://www.training.qaonlinetraining.com/testPage.php");
 
 browserobject.findElement(By.name("name")).sendKeys("demo name anaira");
 browserobject.findElement(By.name("email")).sendKeys("anaira@email.com");
 browserobject.findElement(By.name("website")).sendKeys("www.demowebsite.com");
 browserobject.findElement(By.name("comment")).sendKeys("i am Anaira");
 browserobject.findElement(By.name("submit")).click();
 //browserobject.close();
	}

}
