package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; pushConfirm()']")).click();
		
		Thread.sleep(6000);
		
		Alert al = driver.switchTo().alert(); //Here we are switching to alert by using Alert class
		System.out.println(al.getText());
		
		al.accept(); // Accepting the alert
		//al.dismiss();
		
	}

}
