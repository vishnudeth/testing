package seleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://moodle.cestarcollege.com/moodle/");
		driver.findElement(By.linkText("Faq")).click();
		
		Set<String> allWindows = driver.getWindowHandles();  
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String mainWindow =iter.next();
		String childWindow = iter.next();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(mainWindow);
		System.out.println(mainWindow);
		
		driver.quit();
		
		
		
	}

}
