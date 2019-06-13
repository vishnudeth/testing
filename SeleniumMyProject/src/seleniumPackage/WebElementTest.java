package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/"); //To open the facebook browser
		
		WebElement email = driver.findElement(By.id("email"));
		driver.findElement(By.id("email")).sendKeys("asseasss"); //Finding the email login text and giving the value
		
		WebElement password = driver.findElement(By.id("pass"));
		driver.findElement(By.id("pass")).sendKeys("sadasdadasd"); // Finding the password text and giving the value
		
		WebElement logIn = driver.findElement(By.id("loginbutton"));
		driver.findElement(By.id("loginbutton")).click(); // Clicking the fb login button
		

	}

}
