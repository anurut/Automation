package screens.android;

import org.openqa.selenium.WebElement;
import base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends ScreenBase {

	public HomeScreen(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static AndroidDriver<MobileElement> driver;
	//Constructor of this class



	@AndroidFindBy(id="com.airbnb.android:id/refinement_title")
	public WebElement button;
	

	public HomeScreen clickButton() {
		// TODO Auto-generated method stub
		button.click();
		return this;
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/buttonStartWebview")
	public WebElement startWebview;
	public HomeScreen startWebview() {
		
		startWebview.click();
		return this;
	}
	
	@AndroidFindBy(id="android:id/content")
	public WebElement selectFrame;
	public HomeScreen selectFrame() {
		
		selectFrame.click();
		return this;
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/my_text_field") //using PageFactory
	public WebElement textField;
	
	public HomeScreen typeData(String data) {
		
		textField.sendKeys(data);
		return this;
	}
	


}
