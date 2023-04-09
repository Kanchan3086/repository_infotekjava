package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_Select_DropdownBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		
		Select selectcountry =new Select(driver.findElement(By.name("country")));
		
		selectcountry.selectByVisibleText("India");
		selectcountry.selectByVisibleText("USA");
		selectcountry.selectByVisibleText("France");
		
		Select selectskilss = new Select(driver.findElement(By.name("skill")));

		selectskilss.selectByVisibleText("Programming");
		selectskilss.selectByVisibleText("Quality Assurance");
		
		selectskilss.selectByVisibleText("Database");
        System.out.println("selectByVisibleText(\"Database");
        
        
        System.out.println("Texts got selected successfully from the dropdown boxes ");
        
        Thread.sleep(3000);
        
        //driver.close();
		
		
		
		
		
		

	}

}
