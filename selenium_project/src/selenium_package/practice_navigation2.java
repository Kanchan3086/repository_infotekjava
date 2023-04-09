
package selenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_navigation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browserobject;
		System.setProperty("webdriver.chrome.driver", "c:\\programfiles\\chromedriver.exe");
		
		browserobject =new ChromeDriver();
		
		browserobject.get("http://www.facebook.com");
		System.out.println("this is" + browserobject.getTitle() + "website");
		System.out.println("this is" + browserobject.getCurrentUrl() +"url");
		
		browserobject.navigate().to("http://www.instagram.com");
		
		
		
		System.out.println("this is"+ browserobject.getTitle()+"website");
		System.out.println("this is"+ browserobject.getCurrentUrl()+"url");
		
		browserobject.navigate().to("http://www.tweeter.com");
		System.out.println("this is"+ browserobject.getTitle()+"website");
		System.out.println("this is"+ browserobject.getCurrentUrl()+"url");
		
		browserobject.navigate().back();
		System.out.println("this is"+ browserobject.getTitle()+"website");
		System.out.println("this is"+ browserobject.getCurrentUrl()+"url");
		
		browserobject.navigate().forward();
		System.out.println("this is"+ browserobject.getTitle()+"website");
		System.out.println("this is"+ browserobject.getCurrentUrl()+"url");
		
		browserobject.navigate().back();
		System.out.println("this is"+ browserobject.getTitle()+"website");
		System.out.println("this is"+ browserobject.getCurrentUrl()+"url");
		
		
		
		
		
		browserobject.navigate().back();
		System.out.println("this is "+ browserobject.getTitle()+"website");
		System.out.println("this is"+ browserobject.getCurrentUrl()+" url");
		
		browserobject.navigate().back();
		System.out.println("this is "+ browserobject.getTitle()+"website");
		System.out.println("this is "+ browserobject.getCurrentUrl()+" url");
		
		browserobject.navigate().forward();
		System.out.println("this is "+ browserobject.getTitle()+"website");
		System.out.println("this is "+ browserobject.getCurrentUrl()+" url");
		
		
		//browserobject.close();
		
		
		
		
		
	}

}
