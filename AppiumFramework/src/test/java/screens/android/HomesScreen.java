package screens.android;

import org.openqa.selenium.WebElement;

import base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomesScreen extends ScreenBase {

	public HomesScreen(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	public static AndroidDriver<MobileElement> driver;
	//Constructor of this class



	@AndroidFindBy(id="com.airbnb.android:id/text_view")
	public WebElement tap;
	public HomesScreen tapHomes() {
		// TODO Auto-generated method stub
		tap.click();
		return this;
	}

	@AndroidFindBy(id="com.airbnb.android:id/edit_text")
	public WebElement enterDest;
	public HomesScreen enterDestindation(String data) {
		// TODO Auto-generated method stub
		enterDest.sendKeys(data);
		return this;
	}
}
