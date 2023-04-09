package TestNg_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest_all_annotation_exmpls {
  @Test

	  
	  public void my_method() {
	      System.out.println("my method it's executing after all annotations and after before method");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
	      System.out.println("beforeMethod xecutes after before class");
	  }
	  @AfterMethod
	  public void afterMethod() {
	      System.out.println("afterMethod it wiil execute after normal method executes ");
	  }
	  @BeforeClass
	  public void beforeClass() {
	      System.out.println("beforeClass executes after before test");
	      
	  }
	  @AfterClass
	  public void afterClass() {
	      System.out.println("afterClass  This method wili run after aftermethod ");
	  }
	  @BeforeTest
	  public void beforeTest() {
	      System.out.println("beforeTest executes second after beforeSuite ");
	  }
	  @AfterTest
	  public void afterTest() {
	      System.out.println("afterTest this method will run after afterclass method");
	  }
	  @BeforeSuite
	  public void beforeSuite() {
	      System.out.println("beforeSuite executes first before all annotations");
	  }
	  
	  @AfterSuite
	  public void afterSuite() {
	      System.out.println("afterSuite  this will execute at the end after all the annotations");
	  }
	}



