package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
		//May 4th 2019
		
		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		WebElement radioList = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List <WebElement> radioListDrop = radioList.findElements(By.xpath("//input[@name = 'group1']"));
		
		System.out.println(radioListDrop.size());

		for(WebElement a: radioListDrop)
		{
			System.out.println(a.getAttribute("value")+"----------"+a.isSelected());
		}
		
		radioListDrop.get(2).click();
		
		System.out.println("========================");
		
		for(WebElement a: radioListDrop)
		{
			System.out.println(a.getAttribute("value")+"----------"+a.isSelected());
		}
	}

}
