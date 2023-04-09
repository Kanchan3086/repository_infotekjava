package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_checkin_socialmediaicons_360website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browserobject;
		System.setProperty(("webdriver.driver.chromedriver"), "c:\\programfiles\\chromedriver.exe");
		
		browserobject =  new ChromeDriver();
		
		browserobject.get("https://www.itlearn360.com/");
		
		browserobject.findElement(By.className("fa-facebook")).click();
		
		System.out.println("this is "+ browserobject.getTitle()+ " website");
		System.out.println("this is "+ browserobject.getCurrentUrl()+ " url");
		
		
		browserobject.navigate().back();
		
		browserobject.findElement(By.className("fa-twitter")).click();
		
		System.out.println("this is "+ browserobject.getTitle()+ " website");
		System.out.println("this is "+ browserobject.getCurrentUrl()+ " url");
		
		browserobject.navigate().back();
		
		browserobject.findElement(By.className("fa-instagram")).click();
		
		System.out.println("this is "+ browserobject.getTitle()+ " website");
		System.out.println("this is "+ browserobject.getCurrentUrl()+ " url");
		
		browserobject.navigate().back();
		
		browserobject.findElement(By.className("fa-youtube")).click();
		
		System.out.println("this is "+ browserobject.getTitle()+ " website");
		System.out.println("this is "+ browserobject.getCurrentUrl()+ " url");
		
		browserobject.navigate().back();
		
		browserobject.findElement(By.className("fa-linkedin")).click();
		
		System.out.println("this is "+ browserobject.getTitle()+ " website");
		System.out.println("this is "+ browserobject.getCurrentUrl()+ " url");
		
		browserobject.navigate().back();
		
		//browserobject.close();
		
		

	}

}
