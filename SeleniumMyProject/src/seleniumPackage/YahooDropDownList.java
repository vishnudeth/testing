package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooDropDownList {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		driver.findElement(By.id("uh-search-box")).sendKeys("Canada");
		
		Thread.sleep(5000);
		
		List<WebElement> canList = driver.findElements(By.xpath("//div[@class='yui3-aclist-content']//li"));
		System.out.println(canList.size());
		
		for(WebElement a:canList) {
			System.out.println(a.getText());
		}
	}

}
