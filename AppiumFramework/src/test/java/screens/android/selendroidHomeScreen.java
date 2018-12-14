package screens.android;

import org.openqa.selenium.WebElement;

import base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class selendroidHomeScreen extends ScreenBase {

	public selendroidHomeScreen(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static AndroidDriver<MobileElement> driver;
	//Constructor of this class


	@AndroidFindBy(id="android:id/button1")
	public WebElement dub;
	public selendroidHomeScreen clickOK() {
		// TODO Auto-generated method stub
		dub.click();
		return this;
	}	

	
	@AndroidFindBy(id="io.selendroid.testapp:id/my_text_field")
	public WebElement tap;
	public selendroidHomeScreen enetrText(String data) {
		// TODO Auto-generated method stub
		tap.sendKeys(data);
		return this;
	}
	

}