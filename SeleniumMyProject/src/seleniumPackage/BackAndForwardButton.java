package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("Advertising")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
	}

}
