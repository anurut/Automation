package AutomationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constant;


public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		//ChromeDriver Path
		String exePath = "C:\\Automation learning\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Maximize the Browser Window
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the web site
		driver.get(Constant.URL1);
		
		driver.findElement(By.id("dropdownMenu1")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()= 'Machinery Loan']")).click();
		//List<WebElement> elems = driver.findElements(By.className("dropdown-menu"));
		//System.out.println(elems.size());
		//elems.get(1).click();
		
		
		//Wait for 5 seconds
		Thread.sleep(5000);
		
		//Close the driver
		driver.quit();
		

	}

}
