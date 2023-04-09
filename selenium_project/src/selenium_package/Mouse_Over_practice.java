package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;

System.setProperty("webdriver.chrome.driver", "c:\\program files\\chromedriver.exe");

driver=new ChromeDriver();

driver.get("https://www.amazon.com/");

//WebElement element= driver.findElement(By.xpath("//div[@class='nav-line-1 nav-progressive-content']"));//Hello, sign in this is text on sign in button
////Actions actions= new Actions(driver);

//actions.moveToElement(element).build().perform();

//driver.findElement(By.xpath("//span[contains(text(),'Create a List')]")).click();


//driver.close();

//4. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
Thread.sleep(3000);
// 5. Locate the element using the xpath and store in the reference SiginInelement 
WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]")) ;



// 6. In case of RightClick we use Actions class.Create object and pass the driver to the reference
Actions action = new Actions(driver);
System.out.println("Mouse is over the - HELLO, SIGN IN - option");

// 7. Using the action object call the moveToElement method and pass  SigiInelement reference to this method and perform mouseOver
action.moveToElement(element).build().perform();
Thread.sleep(3000);
// 8. Select a element from the pop up box and perform click
driver.findElement(By.xpath("//span[contains(text(),'Create a List')]")).click();


driver.navigate().back();
System.out.println("the current page is" + driver.getTitle());
//driver.navigate().to("https://www.amazon.com/");
WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'Find a List or Registry')]")) ;
Actions actions1 =new Actions(driver);

actions1.moveToElement(element1).build().perform();

Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'Find a List or Registry')]")).click();
// 9. Close the browser
driver.close();









	}

}
