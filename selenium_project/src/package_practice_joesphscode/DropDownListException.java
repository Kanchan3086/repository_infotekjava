package package_practice_joesphscode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/aa/Desktop/WorkSpace/SeleniumTraining2/src/dropDownList/dropDown.html");
		WebElement employees = driver.findElement(By.xpath("//select[@name='Employees']"));
		Select sel = new Select(employees);
//		sel.selectByIndex(2);
//		sel.selectByValue("KA");
		sel.selectByVisibleText("Samiksha");
		sel.deselectByVisibleText("Samiksha");

	}

}
