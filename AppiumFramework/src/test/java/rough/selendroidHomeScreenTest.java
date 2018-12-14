package rough;

import java.io.IOException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.android.selendroidHomeScreen;
import utils.CommonUtils;

public class selendroidHomeScreenTest {

	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Load capabilities
		String fileName = "selendroidTestApp.properties";
		CommonUtils.loadAndroidprop(fileName);
		CommonUtils.setAndroidCapabilities();
		driver = CommonUtils.getAndroidDriver();
		
		selendroidHomeScreen select = new selendroidHomeScreen(driver);
		//select.clickOK();
		select.enetrText("Hello World");

	}

}
