package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.aliexpress.com/");
		
		
		  List<WebElement> popUp = driver.findElements(By.linkText("x"));
		  
		  if(popUp.size()>0) {
			popUp.get(0).click();
			  
		  }
		  
		 driver.findElement(By.linkText("Buyer Protection")).click();
	}

}
