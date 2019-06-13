package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement FacebookFooter = driver.findElement(By.xpath("//ul[contains(@class, 'uiList pageFooterLinkList')]/li/a"));
		
		//List<WebElement> FbFooterLinks = FacebookFooter.findElements(By.xpath("//ul[contains(@class, 'uiList pageFooterLinkList')]/li/a"));
		
		List<WebElement> FbFooterLinks = FacebookFooter.findElements(By.xpath("//ul[contains(@class, 'uiList pageFooterLinkList')]//a")); //Removed li to get directly into tag 'a' to find the elements 
		
		// / goes down and .. get one step up
		System.out.println(FbFooterLinks.size());
		
		for(int i=0;i<FbFooterLinks.size(); i++) {
			
			System.out.println(FbFooterLinks.get(i).getText());
		}
	}

}
