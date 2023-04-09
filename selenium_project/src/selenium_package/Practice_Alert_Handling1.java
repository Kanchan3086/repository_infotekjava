package selenium_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Alert_Handling1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		//this code is for alert handling of alert_me button
		driver.findElement(By.id("alert")).click();
		
		Alert alertwindow = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alertwindow.accept();
		
		//this code is for  alert handling of confirm_me button
		
		driver.findElement(By.id("confirm")).click();
		
		Alert alertconfirm = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alertconfirm.dismiss();
		
		
		//this code is for  alert handling of prompt_me button
		
		driver.findElement(By.id("prompt")).click();
		Alert alertprompt = driver.switchTo().alert();
		//alertprompt.sendKeys("kanchan");
		
		alertprompt.accept();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
	}

}
