package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("sdasdasasd@adasd.com");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("sdasdasasd");
		
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}

}
