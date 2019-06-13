package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//May5
public class JavaScriptExecuterClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,2000)", "");
		
		System.out.println(driver.findElement(By.linkText("Registration")).getLocation());
		
		WebElement reg = driver.findElement(By.linkText("Registration"));
		jse.executeScript("arguments[0].scrollIntoView(true);",reg);
		
		
	}

}
