package package_practice_joesphscode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/aa/Desktop/WorkSpace/SeleniumTraining2/src/dropDownList/dropDown.html");
		WebElement dropDownList = driver.findElement(By.xpath("//select[@name='Employees']"));
		Select sel = new Select(dropDownList);
		sel.selectByIndex(2);
		sel.selectByValue("KA");
		sel.selectByVisibleText("Samiksha");
		

	}
	}


