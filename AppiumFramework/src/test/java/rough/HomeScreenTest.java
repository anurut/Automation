package rough;

import java.io.IOException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.android.HomeScreen;
import screens.android.HomesScreen;
import utils.CommonUtils;

public class HomeScreenTest {
	
	public static AndroidDriver<MobileElement> driver;

	public static void main(String args[]) throws IOException {
		
		String fileName = "Android_selendroidTestApp.properties";
		CommonUtils.loadAndroidprop(fileName);
		CommonUtils.setAndroidCapabilities();
		driver = CommonUtils.getAndroidDriver();
		
		//String data = "Hello";
		
		HomeScreen screen = new HomeScreen(driver);
		HomesScreen homesScreen = new HomesScreen(driver);
		screen.clickButton();
		homesScreen.tapHomes();
		homesScreen.enterDestindation("Amsterdam");

		//screen.selectFrame();
		//screen.startWebview();
		//screen.typeData(data);

		
	}

}
