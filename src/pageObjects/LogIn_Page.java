package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {
	
	private static WebElement element = null;
	
		public static WebElement getEmail(WebDriver driver) {
			
			element = driver.findElement(By.xpath("//input[@id='login-form-email']"));
			return element;
			
		}
		
		public static WebElement getPassword(WebDriver driver) {
			element = driver.findElement(By.xpath("//input[@id='login-pass']"));
			return element;
		}
		
		public static WebElement getLogIn(WebDriver driver) {
			element = driver.findElement(By.xpath("//div[@class='v-btn__content']"));
			return element;
		}

}
