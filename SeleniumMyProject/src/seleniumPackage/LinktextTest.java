package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinktextTest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver","/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		// driver.findElement(By.linkText("Advertising")).click(); //The link txt that displays on the page
		driver.findElement(By.partialLinkText("Advertis")).click(); // Either way it works by giving partial text in this type
		Thread.sleep(5000);
	
		String expectedTitle = "Google Ads - Get More Customers With Easy Online Advertising";
		String actualTitle = driver.getTitle(); //Driver is going to read the title from the page
		
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle)) {   //equals is a method of the String Class
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
	}

}
