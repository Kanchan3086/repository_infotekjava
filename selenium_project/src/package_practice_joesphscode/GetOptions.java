package package_practice_joesphscode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("file:///C:/Users/aa/Desktop/WorkSpace/SeleniumTraining2/src/dropDownList/dropDown.html");
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='Employees']"));
		Select sel = new Select(dropDown);
	
		List<WebElement> op=sel.getOptions();
		System.out.println(op.size());
		for(int i=0;i<op.size();i++) {
			Thread.sleep(2000);
			System.out.println(op.get(i).getText());
		}
		
		
		
		
		
		
		

	}


	}


