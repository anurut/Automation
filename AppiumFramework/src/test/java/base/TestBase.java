package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestBase {
	
	public static AppiumDriver<MobileElement> driver;
	
	
	@BeforeSuite
	public void setUp() {
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		//driver.quit
		
	}

}
	
