package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Practice_Form_Fillup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserobject;
		
		System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
		
		browserobject = new ChromeDriver();
		
		browserobject.get("http://www.training.qaonlinetraining.com/testPage.php");
		
		browserobject.findElement(By.name("name")).sendKeys("Demo name");
		browserobject.findElement(By.name("email")).sendKeys("kanchan@gmail.com");
		browserobject.findElement(By.name("website")).sendKeys("www.demowebsite.com");
		browserobject.findElement(By.name("comment")).sendKeys("This is demo comment");
		browserobject.findElement(By.name("submit")).click();
		browserobject.close();

	}

}
