package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.LogIn_Page;
import utility.ExcelUtils;

public class SignIn_Action {
public static void Execute (WebDriver driver) throws Exception {
		
		String eMail = ExcelUtils.getCellData(1, 1);
		String passWord = ExcelUtils.getCellData(1, 2);
		
		LogIn_Page.getEmail(driver).clear();
		LogIn_Page.getEmail(driver).sendKeys(eMail);
		LogIn_Page.getPassword(driver).clear();
		LogIn_Page.getPassword(driver).sendKeys(passWord);
		LogIn_Page.getLogIn(driver).click();
	}
}