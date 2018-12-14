package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class AppiumTest {

	public static void main(String[] args) throws InterruptedException {
		//Set the Desired Capabilities
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "My Phone");
		capability.setCapability("udid", "emulator-5554");
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "8.1.0");
		capability.setCapability("appPackage", "com.android.vending");
		capability.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
		capability.setCapability("noReset", "true");
		
		//instantiate Appium driver
		try {
			AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
			Thread.sleep(3000);
			driver.findElement(By.id("com.android.vending:id/search_box_idle_text")).click();
			Thread.sleep(2000);
			MobileElement searchBox = driver.findElement(By.id("com.android.vending:id/search_box_text_input"));
			searchBox.sendKeys("Rivers messenger");
			
			Thread.sleep(2000);
			
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
			Thread.sleep(2000);
			driver.findElement(By.id("com.android.vending:id/play_card")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.className("android.widget.Button")).click();
			Thread.sleep(2000);
			
			// This is how you access an element from a list
			// *********************************************
			List<MobileElement> button = driver.findElements(By.className("android.widget.Button"));
			System.out.println("Size of button list ==>");
			System.out.println(button.size());
			button.get(1).click();
			
			//***********************************************

			//driver.findElement(By.id("identifierId")).sendKeys("slim.thug.konvict@gmail.com");
			//driver.hideKeyboard();
			//Thread.sleep(1000);
			//driver.findElement(By.id("identifierNext")).click();
			//Thread.sleep(4000);
			//String pwd = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.EditTex";
			//driver.findElement(By.className("android.widget.EditText")).sendKeys("abcd");
			//driver.closeApp();
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
}
