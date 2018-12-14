package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {
	
private static WebElement element = null;
	
	/*
	 * Now create a Static Method for each Element (Object) in the Home Page. Each method will have an Argument (driver) and a Return value (element).
	 * 
	 * Driver is being passed as an Argument so that Selenium is able to locate the element on the browser (driver).
	 * Element is returned, so that an Action can be performed on it.
	 * Method is declared as Public Static, so that it can be called in any other method without instantiate the class.
	 */
	
	public static WebElement txtbx_UserName(WebDriver driver){

	    element = driver.findElement(By.id("log"));

	    return element;

	    }
	
	 public static WebElement txtbx_Password(WebDriver driver){

		    element = driver.findElement(By.id("pwd"));

		 return element;

		    }
	 public static WebElement btn_LogIn(WebDriver driver) {
		 
		 	element = driver.findElement(By.id("login"));
		 
		 return element;
		 
	 }

}
