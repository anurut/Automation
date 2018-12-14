package RiversTest;

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

public class RiversTest {

	public static void main(String[] args) throws InterruptedException {
		//Set the Desired Capabilities
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "My Phone");
		capability.setCapability("udid", "emulator-5554");
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "8.1.0");
		capability.setCapability("appPackage", "im.rivers.client");
		capability.setCapability("appActivity", "im.rivers.client.MainActivity");
		capability.setCapability("noReset", "true");
		
		//instantiate Appium driver
		try {
			AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
			
					} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
}
