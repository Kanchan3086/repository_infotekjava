package selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname_practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browserobject;
		
		System.setProperty("webdriver.driver.chromedriver","c:\\programfiles\\chromedriver.exe");
		
		browserobject = new ChromeDriver();
		
		browserobject.get("https://www.itlearn360.com/");
		
		int count =0;
		
		List<WebElement> allelements = browserobject.findElements(By.tagName("a"));
		
		for(WebElement link : allelements) {
			System.out.println(link.getAttribute("href"));
			
			count++;
		}
		
		
		System.out.println("total number of links present: " +count);
		browserobject.close();
	}

}
