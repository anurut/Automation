package AutomationFramework;

 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
// Import package pageObject.*
import PageObject.HomePage;
//import PageObject.LogIn_Page;
import PageObject.LoginActivity;
import utility.Constant;
import utility.ExcelUtils;

public class PageObjectModel {
	
	private static WebDriver driver = null;
	
	public static void main (String[] args) throws Exception {
		//driver = new FirefoxDriver();
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"test");
		//ChromeDriver Path
		String exePath = "C:\\Automation learning\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Constant.URL);
		
		//Thread.sleep(2000);
		
		/*
		 * // Use Page Object Library here
		 
		HomePage.lnk_MyAccount(driver).click();
		LogIn_Page.txtbx_UserName(driver).sendKeys("test_anu");
		LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");
		
		Thread.sleep(2000);
		
		LogIn_Page.btn_LogIn(driver).click();
		
		Thread.sleep(2000);
		
		System.out.println("You've Successfully logged in. Now log out ...");
		
		Thread.sleep(2000);
		
		*/
		
		//Example of Modular Driver Framework
		LoginActivity.Execute(driver);
		
		HomePage.lnk_LogOut(driver).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
