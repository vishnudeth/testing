package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindowTest {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		driver.manage().window().maximize();  //This is to maximize the window
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

}
