package PageObject;

import org.openqa.selenium.WebDriver;

import utility.ExcelUtils;

public class LoginActivity {
	
	
	public static void Execute(WebDriver driver) throws Exception{

	    String sUsername = ExcelUtils.getCellData(1, 1);
	    String sPwd = ExcelUtils.getCellData(1, 2);
		HomePage.lnk_MyAccount(driver).click();
	    LogIn_Page.txtbx_UserName(driver).sendKeys(sUsername);
	    LogIn_Page.txtbx_Password(driver).sendKeys(sPwd);
	    LogIn_Page.btn_LogIn(driver).click();
	    

	    }

}
