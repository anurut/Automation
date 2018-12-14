package rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	static Properties prop = new Properties();
	public static void main(String[] args) throws IOException {
		// To get user directory
		System.out.println(System.getProperty("user.dir"));
		// To load properties file in the variable fis
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Android_selendroidTestApp.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("explicit.wait"));

	}

}
