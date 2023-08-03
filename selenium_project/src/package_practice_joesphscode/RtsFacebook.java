package package_practice_joesphscode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RtsFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select sel2 = new Select(monthDropDown);
		sel2.selectByIndex(4);
		Thread.sleep(2000);
		sel2.selectByValue("7");
		Thread.sleep(2000);
		sel2.selectByVisibleText("Nov");
		Thread.sleep(2000);
		List<WebElement> op=sel2.getOptions();
		System.out.println(op.size());
		for(int i=0;i<op.size();i++) {
			Thread.sleep(2000);
			System.out.println(op.get(i).getText());
		}
		
		
		
		
		
		
		

	}



	}


