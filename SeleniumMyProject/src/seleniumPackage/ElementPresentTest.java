package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	//May 4th 2019
	
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> elementPresent = driver.findElements(By.linkText("Messenger"));
		System.out.println(elementPresent.size());
		
		if(elementPresent.size()>0)  //If size is zero then no element present otherwise element present
		{
			System.out.println("Element Present");
		} else {
			System.out.println("Element not Present");
		}
	}

}
