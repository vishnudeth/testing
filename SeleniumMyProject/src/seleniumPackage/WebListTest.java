package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		//List<WebElement> allLinks = driver.findElements(By.tagName("a")); basic way of finding the links from the whole page
		
		WebElement footer = driver.findElement(By.id("fsl")); // Declaring a webelement as footer to find the elements in the footer of the page
		
		//List<WebElement> allLinks = driver.findElements(By.tagName("a")); // Creating the list to store everythings in the allLinks list with tagname 'a'
		
		//List<WebElement> allLinks = footer.findElements(By.tagName("a")); // This is to find the links only from the footer page
		
		List<WebElement> allLinks1 = footer.findElements(By.xpath("//span[@id='fsl']/a"));
		
		System.out.println(allLinks1.size());
		
		for(int i=0;i<allLinks1.size(); i++)
		{
			System.out.println(allLinks1.get(i).getText());
		}
	}

}
