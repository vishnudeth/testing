package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) {
		//May 4th 2019
		
		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();

	}

}
