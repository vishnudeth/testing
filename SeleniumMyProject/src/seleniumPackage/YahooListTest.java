package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> YahooTrend = driver.findElements(By.xpath("//li[@data-category='trending news']//li"));
		
		System.out.println(YahooTrend.size());
		
		for(int i=0;i<YahooTrend.size(); i++) {
			System.out.println(YahooTrend.get(i).getText());
			
		}
	}

}
