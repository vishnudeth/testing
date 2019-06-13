package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class GoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Canada");
		
		Thread.sleep(2000);
		
		List<WebElement> googleList = driver.findElements(By.xpath("//ul[@role='listbox']/li/div")); 
		
		System.out.println(googleList.size());
		
		for(int i=0; i<googleList.size(); i++)
		{
			System.out.println(googleList.get(i).getText());
		}
		
		
	}

}
