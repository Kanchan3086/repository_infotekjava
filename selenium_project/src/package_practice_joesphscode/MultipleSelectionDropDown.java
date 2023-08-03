package package_practice_joesphscode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("file:///C:/Users/aa/Desktop/WorkSpace/SeleniumTraining2/src/dropDownList/dropDown.html");
		WebElement dropDownList = driver.findElement(By.xpath("//select[@name='Employees']"));
		Select sel = new Select(dropDownList);
		System.out.println(sel.isMultiple());//this method i used to show if the drop down is multiple or not.
		sel.selectByIndex(2);
		sel.selectByValue("KA");
		sel.selectByVisibleText("Samiksha");
		Thread.sleep(3000);
		//sel.deselectAll();this method is only used for multiple drop down
		sel.deselectByValue("KA");
		Thread.sleep(3000);
		sel.deselectByVisibleText("Samiksha");
		
		
		

	}

	}


