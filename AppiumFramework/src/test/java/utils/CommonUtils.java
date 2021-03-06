package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtils {


	//Define Capabilities variables here

	public static int EXPLICIT_WAIT;
	public static int DEFAULT_WAIT;
	public static int IMPLICIT_WAIT;
	public static String APPLICATION_APP; //APK PATH
	public static String BASE_PACKAGE;
	public static int APPIUM_SERVER_PORT;
	public static String APPLICATION_ACTIVITY;
	public static String AUTOMATION_INSTRUMENTATION;
	public static String BROWSER_NAME;
	public static String PLATFORM_NAME;
	public static String DEVICE_NAME;
	public static String PLATFORM_VERSION;
	public static int COMMAND_TIMEOUT;
	public static int DEVICE_TIMEOUT;
	public static String UDID;
	public static URL serverURL;
	private static AndroidDriver<MobileElement> driver;
	private static Properties prop = new Properties();
	public static DesiredCapabilities capability = new DesiredCapabilities();


	public static void loadAndroidprop(String propertyFileName) throws IOException {

		//get property file from test/resources/properties
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\"+ propertyFileName);
		prop.load(fis);

		EXPLICIT_WAIT = Integer.parseInt(prop.getProperty("explicit.wait"));
		DEFAULT_WAIT = Integer.parseInt(prop.getProperty("default.wait"));
		IMPLICIT_WAIT = Integer.parseInt(prop.getProperty("implicit.wait"));
		APPLICATION_APP = prop.getProperty("application.path");
		BASE_PACKAGE = prop.getProperty("base.pkg");
		APPIUM_SERVER_PORT = Integer.parseInt(prop.getProperty("appium.server.port"));
		APPLICATION_ACTIVITY = prop.getProperty("application.activity");
		AUTOMATION_INSTRUMENTATION = prop.getProperty("automation.instumentation");
		BROWSER_NAME = prop.getProperty("browser.name");
		PLATFORM_NAME = prop.getProperty("platform.name");
		DEVICE_NAME = prop.getProperty("device.name");
		PLATFORM_VERSION = prop.getProperty("platform.version");
		COMMAND_TIMEOUT = Integer.parseInt(prop.getProperty("new.command.timeout"));
		DEVICE_TIMEOUT = Integer.parseInt(prop.getProperty("device.ready.timeout"));
		UDID = prop.getProperty("udid");

	}

	public static void setAndroidCapabilities() {

		//capability.setCapability(MobileCapabilityType.APP, CommonUtils.APPLICATION_APP);
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME,CommonUtils.AUTOMATION_INSTRUMENTATION);
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, CommonUtils.DEVICE_NAME);
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, CommonUtils.PLATFORM_NAME);
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, CommonUtils.PLATFORM_VERSION);
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, CommonUtils.COMMAND_TIMEOUT);
		capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, CommonUtils.BASE_PACKAGE);
		capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, CommonUtils.APPLICATION_ACTIVITY);
		capability.setCapability(AndroidMobileCapabilityType.DEVICE_READY_TIMEOUT, CommonUtils.DEVICE_TIMEOUT);
		capability.setCapability(MobileCapabilityType.UDID, CommonUtils.UDID);
		capability.setCapability("noReset", "true");
	}

	public static AndroidDriver<MobileElement> getAndroidDriver() throws MalformedURLException {

		serverURL = new URL("http://localhost:"+APPIUM_SERVER_PORT+"/wd/hub" );
		driver = new AndroidDriver<MobileElement>(serverURL, capability);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		return driver;

	}

}
