package base;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ScreenBase {

	public static AndroidDriver<MobileElement> driver;

	//constructor
	public ScreenBase(AndroidDriver<MobileElement> driver) {

		ScreenBase.driver = driver;
		loadElements();
	}

	//other methods come here
	public void loadElements() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}
