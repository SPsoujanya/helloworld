package helloworld;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Synchronizationinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/users/Pujita Settivari/Automation/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//implicitly wait - is a global wait - applicable to all web elements - for which driver is interacting
		
		driver.get("http://www.facebook.com");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		sendKeys(driver, firstname, 10, "Tom");
		
	}
		
		//explicit wait - for one element -available with webDriverWait with some expected conditions(for ex element to be clickable)- no explicit wait method availabe
		public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
		{
			new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
			
		}
		
	
}
