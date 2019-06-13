package seleniumPackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/"); //both get and navigate().to are multiple methods
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
	}

}
