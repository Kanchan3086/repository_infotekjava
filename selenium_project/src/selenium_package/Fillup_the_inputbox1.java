package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fillup_the_inputbox1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver browserobject;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		browserobject = new ChromeDriver();
		browserobject.get("http://www.training.qaonlinetraining.com/testPage.php");
		
		browserobject.findElement(By.name("name")).sendKeys("kanchan ");
		browserobject.findElement(By.name("email")).sendKeys("kanchan@gmail.com ");
		browserobject.findElement(By.name("website")).sendKeys("www.google.com ");
		browserobject.findElement(By.name("comment")).sendKeys("I am happy");
		Thread.sleep(3000);
		
		browserobject.findElement(By.name("submit")).click();
		
		//browserobject.close();
		
	}

}
