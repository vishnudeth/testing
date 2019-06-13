package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		String Actual = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(Actual);
		
		driver.findElement(By.id("gh-ac")).sendKeys("Iphone");
		
		String P = driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(P);
	}

}
