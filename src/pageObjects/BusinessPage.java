package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessPage {
	
	
	public static WebElement getBusiness(WebDriver driver) {
		WebElement business = driver.findElement(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']"));
		return business;
	}
	public static void setBusiness(WebDriver driver) {
		getBusiness(driver).click();
	}

//	AddNewBusiness
	public static WebElement getAddNewBusiness (WebDriver driver) {
		WebElement addNewBusiness = driver.findElement(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']"));
		return addNewBusiness;
	}
	public static void setAddNewBusiness (WebDriver driver) {
		getAddNewBusiness(driver).click();
	}
	
//	BusinessName
	public static WebElement getBusinessName (WebDriver driver) {
		WebElement businessName = driver.findElement(By.xpath("//input[@id='business-form-name']"));
		return businessName;
	}
	public static void setBusinessName (WebDriver driver, String businessName) {
		getBusinessName(driver).sendKeys(businessName);
	}
	
//	Countries
	public static WebElement getCountries (WebDriver driver) {
		WebElement countries = driver.findElement(By.xpath("//input[@id='business-form-country']"));
		return countries;
	}
	public static void setCountries(WebDriver driver, String countryName) throws InterruptedException {   
		Actions builder = new Actions(driver);
		Actions country = builder
		.moveToElement(getCountries(driver))
		.click()
		.sendKeys(countryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
	}
	
//	City
	public static WebElement getCity (WebDriver driver) {
		WebElement city = driver.findElement(By.xpath("//input[@id='business-form-city']"));
		return city;
	}
	public static void setCity (WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}
	
//	Street
	public static WebElement getStreet (WebDriver driver) {
		WebElement street = driver.findElement(By.xpath("//input[@id='business-form-street']"));
		return street;
	}
	public static void setStreet (WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}
	
//	Zip
	public static WebElement getZip (WebDriver driver) {
		WebElement zip = driver.findElement(By.id("business-form-zip"));
		return zip;
	}
	public static void setZip (WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);
	}
	
//	RegistryNumber
	public static WebElement getRegistryNumber (WebDriver driver) {
		WebElement registryNumber = driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));
		return registryNumber;
	}
	public static void setRegistryNumber (WebDriver driver, String registryNumber) {
		getRegistryNumber(driver).sendKeys(registryNumber);
	}
	
	
//	AddBankAccount
	public static WebElement getAddBankAccount (WebDriver driver) {
		WebElement addBankAccount = driver.findElement(By.xpath("//button[@id='business-form-add-bank-btn']"));
		return addBankAccount;
	}
	public static void setAddBankAccount (WebDriver driver) {
		getAddBankAccount(driver).click();
	}
	
//	BankName
	public static WebElement getBankName (WebDriver driver) {
		WebElement bankName = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
		return bankName;
	}
	public static void setBankName (WebDriver driver, String bankName) {
		getBankName(driver).sendKeys(bankName);
	}
	
//	AccountNumber
	public static WebElement getAccountNumber (WebDriver driver) {
		WebElement accountNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		return accountNumber;
	}
	public static void setAccountNumber (WebDriver driver, String accountNumber) {
		getAccountNumber(driver).sendKeys(accountNumber);
	}
	
//	SwiftNumber
	public static WebElement getSwiftNumber (WebDriver driver) {
		WebElement swiftNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		return swiftNumber;
	}
	public static void setSwiftNumber (WebDriver driver, String swiftNumber) {
		getSwiftNumber(driver).sendKeys(swiftNumber);
	}
	
//	PaymentInstructions
	public static WebElement getPaymentInstructions (WebDriver driver) {
		WebElement paymentInstructions = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		return paymentInstructions;
	}
	public static void setPaymentInstructions (WebDriver driver, String paymentInstructions) {
		getPaymentInstructions(driver).sendKeys(paymentInstructions);
	}
	
//	Currency
	
	private static WebElement ele;
	public static WebElement getCurrency(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        ele = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='v-select__selections']")));
        return ele;
    }

    public static List<WebElement> getCurrencyLabel(WebDriver driver) {
        List<WebElement> currencyList = new ArrayList();
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Dinar')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Euro')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'US Dollar')]")));
        return currencyList;
    }

    public static void setCurrency(WebDriver driver, String currencyName) {
        Actions builder = new Actions(driver);
        WebElement currencyList = getCurrency(driver);
        Actions currency = builder.moveToElement(currencyList).click();
        currency.perform();
        List<WebElement> CurrencyLabel = getCurrencyLabel(driver);
        for (WebElement e : CurrencyLabel) {
            if (e.getText().equals(currencyName)) {
                e.click();
            }
        }
    }
	
//	AddBankAccount2
	public static WebElement getAddBankAccount2 (WebDriver driver) {
		WebElement addBankAccount2 = driver.findElement(By.xpath("//button[@id='bank-dialog-add-bank']"));
		return addBankAccount2;
	}
	public static void setAddBankAccount2 (WebDriver driver) {
		getAddBankAccount2(driver).click();
	}
	
	
//	Save
	public static WebElement getSave (WebDriver driver) {
		WebElement Save = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return Save;
	}
	public static void setSave (WebDriver driver) {
		getSave(driver).click();
	}
}
