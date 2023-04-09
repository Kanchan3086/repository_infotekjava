package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Selecting_Checkbox_using_xpath_locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		
		System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.name("name")).sendKeys("kanchan");
		driver.findElement(By.name("email")).sendKeys("kanchan@gmail.com");
		driver.findElement(By.name("website")).sendKeys("www.demowebsite.com");
		driver.findElement(By.name("comment")).sendKeys("it's a learning website");
		driver.findElement(By.xpath("//input[@value='female']")).click();
		
		driver.findElement(By.xpath("//input[@value='Bike']")).click();//this line is to find checkbox element by using xpath locator
		//driver.findElement(By.name("car")).click();
		driver.findElement(By.xpath("//input[@value='boat']")).click();
		driver.findElement(By.xpath("//input[@value='horse']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("submit")).click();
		
		
		
		//WebElement chekboxbike = driver.findElement(By.xpath("//input[@value='Bike']"));
		
		// 4. Locate the boat checkbox button using xpath and store the value in  reference created that is checkboxBoat.
		//WebElement checkboxBoat = driver.findElement(By.xpath("//input[@value='boat']"));
		
		
		driver.close();
		
		
		

	}

}
