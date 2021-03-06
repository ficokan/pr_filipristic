package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClientsPage {
	
	public static WebElement getClients(WebDriver driver) {
		WebElement clients = driver.findElement(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']"));
		return clients;
	}
	public static void setClients(WebDriver driver) {
		getClients(driver).click();
	}
	
//	AddNewClient
	public static WebElement getAddNewClient(WebDriver driver) {
		WebElement addNewClient = driver.findElement(By.xpath("//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		return addNewClient;
	}
	public static void setAddNewClient(WebDriver driver) {
		getAddNewClient(driver).click();		
	}
	
//	ClientName
	public static WebElement getClientName(WebDriver driver) {
		WebElement clientName= driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return clientName;
	}
	public static void setClientName(WebDriver driver, String clientName) {
		getClientName(driver).sendKeys(clientName);		
	}
	
//	ContactName
	public static WebElement getContactName(WebDriver driver) {
		WebElement contactName = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return contactName;
	}
	public static void setContactName(WebDriver driver, String contactName) {
		getContactName(driver).sendKeys(contactName);		
	}
	
//	Email
	public static WebElement getEmail(WebDriver driver) {
		WebElement email = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
		return email;
	}
	public static void setEmail(WebDriver driver, String email) {
		getEmail(driver).sendKeys(email);		
	}
	
//	RegistryNumber
	public static WebElement getRegistryNumber(WebDriver driver) {
		WebElement registryElement = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return registryElement;
	}
	public static void setRegistryNumber(WebDriver driver, String registry) {
		getRegistryNumber(driver).sendKeys(registry);		
	}
	
//	Countries
	public static WebElement getCountries(WebDriver driver) {
	    WebElement country = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
	    return country;
	}
	
	public static void setCountries(WebDriver driver, String countryName) throws InterruptedException
    {
    Actions builder = new Actions(driver);
    Actions country = builder
    .moveToElement(getCountries(driver))
    .click()
    .sendKeys(countryName);
    country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
    country.perform();
    }
    
//	City
	public static WebElement getCity(WebDriver driver) {
		WebElement city = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return city;
	}
	public static void setCity(WebDriver driver, String city) {
		getCity(driver).sendKeys(city);		
	}
	
//	Street
	public static WebElement getStreet(WebDriver driver) {
		WebElement street = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[@class='layout']/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return street;
	}
	public static void setStreet(WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);		
	}
	
//	Zip
	public static WebElement getZip(WebDriver driver) {
		WebElement zip = driver.findElement(By.xpath("//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return zip;
	}
	public static void setZip(WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);		
	}
	
//	Code
	public static WebElement getCode(WebDriver driver) {
		WebElement code = driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[4]/div[2]/div/div[2]/div[1]/div/input"));
		return code;
	}
	public static void setCode(WebDriver driver, String code) {
		getCode(driver).sendKeys(code);		
	}
	
//	Save
	public static WebElement getSaveClient(WebDriver driver) {
		WebElement saveClient = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/button[1]/div[1]"));
		return saveClient;
	}
	public static void setSaveClient(WebDriver driver) {
		getSaveClient(driver).click();
	}
	
}