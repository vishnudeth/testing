package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleBrowserTest {

	public static void main(String[] args) {
	
		String browser = "Firefox"; //or Chrome / IE
		
		WebDriver driver;
		if(browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		driver = new FirefoxDriver();
		} else if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","/Users/Deth/Desktop/Selenium/SeleniumJars/chromedriver");
		driver = new ChromeDriver();
		} else {
		System.setProperty("webdriver.chrome.driver","/Users/Deth/Desktop/Selenium/SeleniumJars/chromedriver");
		driver = new ChromeDriver();	
		}
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions builder = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		builder.dragAndDrop(drag, drop).build().perform(); //dragAndDrop function used to perform the drag and drop functionality
		
				
		if(drop.getText().equals("Dropped!")) {	
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		

	}

}
