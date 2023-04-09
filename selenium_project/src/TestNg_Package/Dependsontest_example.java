package TestNg_Package;

import org.testng.annotations.Test;

public class Dependsontest_example {
	 @Test(groups = "login")
	    public void enterUsername() {
	        System.out.println("enter username 1");
	    }
	    @Test(groups = "login", dependsOnMethods = "enterUsername")
	    public void enterPassword() {
	        System.out.println("enter password 2");
	    }
	    @Test(groups = "login", dependsOnMethods = "enterPassword")
	    public void clickonlogin() {
	        System.out.println("click on login button 3");
	    }
	    @Test(groups = "login", dependsOnMethods = "clickonlogin")
	    public void selectlocation() {
	        System.out.println("select location 4");
	    }
	    @Test(groups = "login", dependsOnMethods = "selectlocation")
	    public void selectpreferences() {
	        System.out.println("select preferenece 5");
	    }
	    @Test(groups = "search", dependsOnMethods = "selectpreferences")
	    public void selectDate() {
	        System.out.println("select dates 6");
	    }
	    @Test(groups = "search", dependsOnMethods = "selectDate")
	    public void clickonsearch() {
	        System.out.println("click on search 7");
	    }
	    @Test(groups = "logout", dependsOnMethods = "clickonsearch")
	    public void clickonlogout() {
	        System.out.println("click on logout button 8 ");
	        System.out.println("Logout from flight reservation system 9 ");
	    }
	}