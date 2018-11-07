package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import pageObjects.BusinessPage;
import utility.ExcelUtils;

public class BusinessTest {
	
	
	public static void Execute(WebDriver driver) throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		BusinessPage.setBusiness(driver);
		Thread.sleep(2000);
		BusinessPage.setAddNewBusiness(driver);
	    Thread.sleep(2000);
		
	    String name = ExcelUtils.getCellData(1, 1);
	    BusinessPage.setBusinessName(driver, name);
		String country = ExcelUtils.getCellData(1, 2);
		BusinessPage.setCountries(driver, country);
		String city = ExcelUtils.getCellData(1, 3);
		BusinessPage.setCity(driver, city);
		String street = ExcelUtils.getCellData(1, 4);
		BusinessPage.setStreet(driver, street);
		String zip = ExcelUtils.getCellData(1, 5);
		BusinessPage.setZip(driver, zip);
		String registry = ExcelUtils.getCellData(1, 6);
		BusinessPage.setRegistryNumber(driver, registry);
		
		BusinessPage.setAddBankAccount(driver);
	    Thread.sleep(2000);
	    
		String bankName = ExcelUtils.getCellData(1, 7);
		BusinessPage.setBankName(driver, bankName);
		String accNumber = ExcelUtils.getCellData(1, 8);
		BusinessPage.setAccountNumber (driver, accNumber);
		String swift = ExcelUtils.getCellData(1, 9);
		BusinessPage.setSwiftNumber(driver, swift);
		String payment = ExcelUtils.getCellData(1, 10);
		BusinessPage.setPaymentInstructions(driver, payment);
		String currency = ExcelUtils.getCellData(1, 11);
		BusinessPage.setCurrency(driver, currency);
	    Thread.sleep(2000);
	    
	    BusinessPage.setAddBankAccount2(driver);
	    Thread.sleep(2000);
		
		BusinessPage.setSave(driver);
		Thread.sleep(5000);
	
	}
}