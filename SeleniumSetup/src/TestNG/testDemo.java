package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testDemo {
	
	static WebDriver driver = null;
	
	
	@BeforeTest
	public static void setup() {
		
		//ChromeDriver Path
				String exePath = "C:\\Automation learning\\chromedriver_win32\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				driver = new ChromeDriver();
				//maximize window
				driver.manage().window().maximize();
				//implicit wait
				
	}
	
	@Test
	public static void GoogleSearch() throws Exception {
		
		driver.get("https://google.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()= 'NO, THANKS']")).click();
		Thread.sleep(2000);
		
		WebElement txt = driver.findElement(By.name("q"));
		txt.sendKeys("ABCD");
		Thread.sleep(2000);
		
		System.out.println("Name added ==============================================");
		
		txt.sendKeys(Keys.RETURN);
		
		System.out.println("Button clicked");
	}
	
	@AfterTest
	public static void endSetup() {
		
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
