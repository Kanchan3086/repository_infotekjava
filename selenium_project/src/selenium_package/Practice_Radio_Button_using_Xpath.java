package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Radio_Button_using_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		
		//WebElement radioButtonFemale = browserObject.findElement(By.xpath("//input[@value='female']"));
		
		//driver.findElement(By.name("name")).sendKeys("kanchan");
		//driver.findElement(By.name("email")).sendKeys("kanchan@gmail.com");
		//driver.findElement(By.name("website")).sendKeys("www.demowebsite.com");
		//driver.findElement(By.name("comment")).sendKeys("it's a learning website");
		//WebElement radioButtonFemale = browserObject.findElement(By.xpath("//input[@value='female']"));  this is another way of selecting radiobutton
		// radioButtonFemale.click();
		//driver.findElement(By.xpath("//input[@value='male']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='female']")).click();
		//driver.findElement(By.xpath("//input[@value='male']")).click();
		//driver.findElement(By.xpath("//input[@value='Other']")).click();
		driver.findElement(By.name("submit")).click();
		driver.close();

	}

}
