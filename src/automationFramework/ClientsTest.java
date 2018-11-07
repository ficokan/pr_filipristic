package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import pageObjects.ClientsPage;
import utility.ExcelUtils;

public class ClientsTest {
	
	public static void Execute(WebDriver driver) throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String clientName = ExcelUtils.getCellData(1, 1);
		String contactName = ExcelUtils.getCellData(1, 2);
		String email = ExcelUtils.getCellData(1, 3);
		String registry = ExcelUtils.getCellData(1, 4);
		String country = ExcelUtils.getCellData(1, 5);
		String city = ExcelUtils.getCellData(1, 6);
		String street = ExcelUtils.getCellData(1, 7);
		String zip = ExcelUtils.getCellData(1, 8);
		String code = ExcelUtils.getCellData(1, 9);
		
		Thread.sleep(2000);
	    ClientsPage.setClients(driver);
	    Thread.sleep(2000);
	    ClientsPage.setAddNewClient(driver);
	    Thread.sleep(2000);
	    
	    ClientsPage.setClientName(driver, clientName);
	    ClientsPage.setContactName(driver, contactName);
	    ClientsPage.setEmail(driver, email);
	    ClientsPage.setRegistryNumber(driver, registry);
	    ClientsPage.setCountries(driver, country);
	    Thread.sleep(1000);
	    ClientsPage.setCity(driver, city);
	    Thread.sleep(1000);
	    ClientsPage.setStreet(driver, street);
	    ClientsPage.setZip(driver, zip);
	    Thread.sleep(1000);
	    ClientsPage.setCode(driver, code);
	    
	    Thread.sleep(1000);
	    ClientsPage.setSaveClient(driver);
	    
	    Thread.sleep(5000);
	
	}
}