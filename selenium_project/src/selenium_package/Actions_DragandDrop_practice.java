package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragandDrop_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.id("draggable"));
		
		WebElement element1 =driver.findElement(By.id("droppable"));
		
		
		
		Thread.sleep(3000);
		
		// WebElement source = browserObject.findElement(By.xpath("//div[@id='draggable']"));
		
		//WebElement source1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//WebElement source2 =driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions actions= new Actions(driver);
		
		Thread.sleep(3000);
		//actions.dragAndDrop(source1, source2).build().perform();
		
		actions.dragAndDrop(element, element1).build().perform();
		
		driver.close();
		
		
		
		//Actions actions = new Actions(driver);
	}

}
