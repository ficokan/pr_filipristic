package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appModules.SignIn_Action;

import utility.Constant;
import utility.ExcelUtils;

public class Apache_POI_TC {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		SignIn test
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"LogIn");
		 
		driver.get(Constant.URL);
		SignIn_Action.Execute(driver);
		Thread.sleep(5000);
		
//		Ispis fail/pass u excelu
		System.out.println(driver.getCurrentUrl());
		String testStatus;
		if(driver.getCurrentUrl().equals("http://app.invoice-factory.source-code.rs/invoices")){
			testStatus="pass";
		}
		else {
			testStatus="fail";
		}
		ExcelUtils.setCellData(testStatus, 1, 3);
		
//		Business test

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Business");
		BusinessTest.Execute(driver);
		
//		Clients test

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Clients");
		ClientsTest.Execute(driver);

		
		driver.close();
	}

}
