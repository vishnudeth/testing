package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		List<WebElement> ddList = box.findElements(By.xpath("//select[@id='gh-cat']//option"));
		
		System.out.println(ddList.size());
		
		/*
		 * for(int i=0;i<ddList.size(); i++) {
		 * System.out.println(ddList.get(i).getText()); }
		 */
		
		 for(WebElement a : ddList)  // We can do it in bth ways it is easier to use it in for each loop 
		  { 
			 //System.out.println(a.getText()+"-----------"+a.isSelected());
			 
			 if(a.isSelected()){
				 
				 System.out.println(a.getText()+"-----------"+a.isSelected());
				 
			 }
			 
		  
		  }
		  
		 Select s = new Select(box);
		 s.selectByIndex(4); 
		 s.selectByValue("2984");
		 s.selectByVisibleText("Baby");
		 
		 System.out.println("-----------------------------");
		 
		 for(WebElement a : ddList)  // We can do it in bth ways it is easier to use it in for each loop 
		 
		 { System.out.println(a.getText()+"-----------"+a.isSelected());
		  
		 }
		
		 
		 
	}

}
